# import the function that will return an instance of a connection
from mysqlconnection import connectToMySQL
from flask import flash
# model the class after the user table from our database
class Comment:
    def __init__( self , data ):
        self.id = data['id']
        self.name = data['name']
        self.location = data['location']
        self.comment = data['comment']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    # Now we use class methods to query our database
        
    @classmethod
    def insert_comment(cls,data):
        query = "INSERT into dojos(name,location,language,comment) VALUES ( %(name)s,%(location)s,%(language)s,%(comment)s );"
        results = connectToMySQL('dojo_survey_schema').query_db(query,data)
        return results 
    
    @classmethod
    def last_comment(cls,data):
        query = """
                SELECT * from dojos  
                ORDER BY dojos.id
                DESC LIMIT 1;
                """
        results = connectToMySQL('dojo_survey_schema').query_db(query,data)
        return Comment(results) 
    
    @staticmethod
    def validate_comment(comment):
        is_valid = True # we assume this is true
        if len(comment['name']) < 3:
            flash("Name must be at least 3 characters.")
            is_valid = False
        if len(comment['comment']) < 10:
            flash("Comment must be at least 10 characters.")
            is_valid = False
        return is_valid