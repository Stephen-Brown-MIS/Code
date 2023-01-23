# books_controller.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.book_model import Book
from flask_app.models.author_model import Author


@app.route("/books/new")
def new_book_view():
    authors=Author.get_all()
    print("*******  test point *******")
    print(authors)
    return render_template("new_book.html",authors=authors)

# Create the new book  ----------  ACTION

@app.route("/books/create", methods=['post']) 
def create_book():
    print(f"\n ****** \n {request.form} \n ****** \n")
    new_book_id = Book.insert_book(request.form)
    author_id=request.form["author_id"]
    return redirect (f"/authors/{author_id}/show")

# Read all books, send to author detail screen -----   VIEW

@app.route("/books")
def select_all_books(id):
    all_books = Book.get_all_books()
    return render_template("author_detail.html",all_books=all_books) 

