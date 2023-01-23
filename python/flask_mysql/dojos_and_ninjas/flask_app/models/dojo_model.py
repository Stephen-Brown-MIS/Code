# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask_app.models import ninja_model
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
        print(results)
        dojo_instances = []
        if results:
            for row in results:
                this_dojo = cls(row)
                dojo_instances.append(this_dojo)
            return dojo_instances
        return []

        # Create an empty list to append our instances of dojos
        # dojos = []
        # # Iterate over the db results and create instances of dojos with cls.
        # for dojo in results:
        #     dojos.append( cls(dojo) )
        # return dojos

    @classmethod
    def insert_dojo(cls,data):
        query = "INSERT INTO dojos(name) VALUES ( %(name)s );"
        results = connectToMySQL('dojos').query_db(query,data)
        return results 

    @classmethod
    def select_one_dojo(cls,data):
        query = """ SELECT * FROM dojos 
                    LEFT JOIN ninjas ON  dojos.id = ninjas.dojo_id
                    WHERE dojos.id = %(id)s;
                """
        results = connectToMySQL('dojos').query_db(query,data)
        # print(results[0])
        if results:
            this_dojo = cls(results[0]) 
            these_ninjas =[]
            for row in results:
                ninja_data = {
                    'id': row['ninjas.id'],
                    'first_name': row['first_name'],
                    'last_name' : row['last_name'],
                    'age' : row['age'],
                    'dojo_id': row['dojo_id'],
                    'created_at': row['ninjas.created_at'],
                    'updated_at': row['ninjas.updated_at'],
                }
                this_ninja = ninja_model.Ninja(ninja_data)
                these_ninjas.append(this_ninja)
        
        this_dojo.ninjas = these_ninjas
        print("***** this dojo *****")
        print (this_dojo.ninjas)
        return this_dojo
        
    

    # self.first_name = data['first_name']
    #     self.last_name = data['last_name']
    #     self.age = data['age']
