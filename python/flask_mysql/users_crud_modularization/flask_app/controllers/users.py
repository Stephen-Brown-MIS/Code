# users.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.user import User

@app.route("/")
def index():
    users = User.get_all()
    print(users)
    return render_template("index.html", users=users)

# Show the new user screen

@app.route("/users/new")
def new_user_view():
    return render_template("new_user.html")

# Create the new user

@app.route("/users/create", methods=['post'])
def create_user():
    print(request.form)
    new_user_id = User.insert_user(request.form)
    return redirect (f"/users/{new_user_id}/show")

# Display a single user

@app.route("/users/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_user = User.select_one_user(data)
    return render_template("user_select_one.html",this_user=this_user) 

# Show the Edit for a single user

@app.route("/users/<int:id>/edit")
def edit_user(id):
    data = {
        **request.form,
        'id':id
    }
    this_user = User.select_one_user(data)
    return render_template("edit_user.html",this_user=this_user)

# Process an update  for a single user

@app.route("/users/<int:id>/update", methods=['post'])
def update_user(id):
    data = {
        **request.form,
        'id': id,
            }
    User.update_one_user(data) 
    return redirect (f"/users/{id}/show")

# Delete a user

@app.route("/users/<int:id>/delete", methods=['get'])
def delete_user(id):
    data = {
        **request.form,
        'id':id
            }
    User.delete_one_user(data) 
    return redirect ("/")