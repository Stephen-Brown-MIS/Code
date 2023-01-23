# authors.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.author_model import Author

# Show the new author screen ----- VIEW

@app.route("/")
def index():
    authors = Author.get_all()
    return render_template("index.html", authors=authors)

# Show the new author screen ----- VIEW

@app.route("/authors/new")
def new_author_view():
    authors = Author.get_all()
    return render_template("index.html", authors=authors)

# Create the new author ------     ACTION

@app.route("/authors/create", methods=['post'])
def create_author():
    print(request.form)
    author_id = Author.insert_author(request.form)
    return redirect ("/authors/new")

# Display a single author -----    VIEW

@app.route("/authors/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_author = Author.select_one_author(data)
    print(this_author)
    return render_template("author_detail.html",this_author=this_author) 

