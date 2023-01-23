# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
# from flask_app import DATABASE
# import the model that you are joining to? Why is this not resolving? 
from flask_app.models import author_model

class Book:
    def __init__( self , data ):
        self.id = data['id']
        self.title = data['title']
        self.num_of_pages = data['num_of_pages']
        self.author_id = data['author_id']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    # Now we use class methods to query our database
    @classmethod
    def get_all_books(cls):
        query = "SELECT * FROM books WHERE author_id = %(author_id)s;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('books').query_db(query)
        # Create an empty list to append our instances of books
        books = []
        # Iterate over the db results and create instances of books with cls.
        print(results)
        print()
        for book in results:
            books.append( cls(book) )
        return books

    @classmethod
    def insert_book(cls,data):
        query = """
                INSERT INTO books(title,num_of_pages) 
                VALUES ( %(title)s, %(num_of_pages)s );
                """
        results = connectToMySQL('books').query_db(query,data)
        return results 

    