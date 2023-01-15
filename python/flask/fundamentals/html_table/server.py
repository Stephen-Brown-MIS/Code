from flask import Flask, render_template  # Import Flask and render template
app = Flask(__name__)    # a new instance of the Flask class called "app"

@app.route('/')        
def html_table():
    users_data = [
        {'first_name' : 'Michael', 'last_name' : 'Choi'},
        {'first_name' : 'John', 'last_name' : 'Supsupin'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

    return render_template("index.html",users=users_data) 

if __name__=="__main__":   
    app.run(debug=True,port="5002")    


