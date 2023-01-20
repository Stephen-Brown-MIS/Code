# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
# model the class after the dojo table from our database
class Dojo:
    def __init__( self , data ):
        self.id = data['id']
        self.name = data['name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    # Now we use class methods to query our database
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM dojos;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('dojos').query_db(query)
        # Create an empty list to append our instances of dojos
        dojos = []
        # Iterate over the db results and create instances of dojos with cls.
        for dojo in results:
            dojos.append( cls(dojo) )
        return dojos

    @classmethod
    def insert_dojo(cls,data):
        query = "INSERT into dojos(name) VALUES ( %(name)s );"
        results = connectToMySQL('dojos').query_db(query,data)
        return results 

    @classmethod
    def select_one_dojo(cls,data):
        query = "SELECT * from dojos WHERE id = %(id)s;"
        results = connectToMySQL('dojos').query_db(query,data)
        # print(results[0])
        if results:
            return cls(results[0])
        return []
        
    