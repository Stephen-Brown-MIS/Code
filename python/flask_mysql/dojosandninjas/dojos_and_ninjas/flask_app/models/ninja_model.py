# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
# from flask_app import DATABASE
# import the model that you are joining to? Why is this not resolving? 
from flask_app.models import dojo_model

class Ninja:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.age = data['age']
        self.dojo_id = data['dojo_id']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    # Now we use class methods to query our database
    @classmethod
    def get_all_ninjas(cls):
        query = "SELECT * FROM ninjas WHERE dojo_id = %(dojo_id)s;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('ninjas').query_db(query)
        # Create an empty list to append our instances of ninjas
        ninjas = []
        # Iterate over the db results and create instances of ninjas with cls.
        print(results)
        print()
        for ninja in results:
            ninjas.append( cls(ninja) )
        return ninjas

    @classmethod
    def insert_ninja(cls,data):
        query = """
                INSERT INTO ninjas(first_name,last_name,age,dojo_id) 
                VALUES ( %(first_name)s, %(last_name)s,%(age)s,%(dojo_id)s );
                """
        results = connectToMySQL('ninjas').query_db(query,data)
        return results 

    