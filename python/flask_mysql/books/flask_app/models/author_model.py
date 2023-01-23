# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask_app.models import book_model
# model the class after the author table from our database
class Author:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
        
        

    # Now we use class methods to query our database
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM authors;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('authors').query_db(query)
        print(results)
        author_instances = []
        if results:
            for row in results:
                this_author = cls(row)
                author_instances.append(this_author)
            return author_instances
        return []

    @classmethod
    def insert_author(cls,data):
        query = "INSERT INTO authors(first_name,last_name) VALUES ( %(first_name,last_name)s );"
        results = connectToMySQL('authors').query_db(query,data)
        return results 

    @classmethod
    def select_one_author(cls,data):
        query = """ SELECT * FROM authors 
                    LEFT JOIN books ON  authors.id = books.author_id
                    WHERE authors.id = %(id)s;
                """
        results = connectToMySQL('authors').query_db(query,data)
        # print(results[0])
        if results:
            this_author = cls(results[0]) 
            these_books =[]
            for row in results:
                book_data = {
                    'id': row['books.id'],
                    'title': row['title'],
                    'num_of_pages' : row['num_of_pages'],
                    'author_id': row['author_id'],
                    'created_at': row['books.created_at'],
                    'updated_at': row['books.updated_at'],
                }
                this_book = book_model.book(book_data)
                these_books.append(this_book)
        
        this_author.books = these_books
        print("***** this author *****")
        print (this_author.books)
        return this_author
        
    
