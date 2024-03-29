# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
# model the class after the user table from our database
class User:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.email = data['email']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    # Now we use class methods to query our database
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM users;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('users').query_db(query)
        # Create an empty list to append our instances of users
        users = []
        # Iterate over the db results and create instances of users with cls.
        for user in results:
            users.append( cls(user) )
        return users

    @classmethod
    def insert_user(cls,data):
        query = "INSERT into users(first_name,last_name,email) VALUES ( %(first_name)s, %(last_name)s,%(email)s );"
        results = connectToMySQL('users').query_db(query,data)
        return results 

    @classmethod
    def select_one_user(cls,data):
        query = "SELECT * from users WHERE id = %(id)s;"
        results = connectToMySQL('users').query_db(query,data)
        # print(results[0])
        if results:
            return cls(results[0])
        return []
        
    @classmethod
    def update_one_user(cls,data):
        query = """
        UPDATE users 
        SET first_name = %(first_name)s, 
            last_name = %(last_name)s, 
            email = %(email)s 
            WHERE id = %(id)s;
            """
        results = connectToMySQL('users').query_db(query,data)
        return results

    @classmethod
    def delete_one_user(cls,data):
        query = "DELETE from users WHERE id = %(id)s;"
        results = connectToMySQL('users').query_db(query,data)
        return results
