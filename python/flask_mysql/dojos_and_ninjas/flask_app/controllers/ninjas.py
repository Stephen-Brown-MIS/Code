# ninjas.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.ninja import ninja

# @app.route("/")
# def index():
#     ninjas = ninja.get_all()
#     print(ninjas)
#     return render_template("index.html", ninjas=ninjas)

# Show the new ninja screen

@app.route("/ninjas/new")
def new_ninja_view():
    return render_template("new_ninja.html")

# Create the new ninja

@app.route("/ninjas/create", methods=['post'])
def create_ninja():
    print(request.form)
    new_ninja_id = ninja.insert_ninja(request.form)
    return redirect ("/dojos/show")

# Display a single ninja

@app.route("/ninjas/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_ninja = ninja.select_one_ninja(data)
    return render_template("ninja_select_one.html",this_ninja=this_ninja) 

# Show the Edit for a single ninja

@app.route("/ninjas/<int:id>/edit")
def edit_ninja(id):
    data = {
        **request.form,
        'id':id
    }
    this_ninja = ninja.select_one_ninja(data)
    return render_template("edit_ninja.html",this_ninja=this_ninja)

# Process an update  for a single ninja

@app.route("/ninjas/<int:id>/update", methods=['post'])
def update_ninja(id):
    data = {
        **request.form,
        'id': id,
            }
    ninja.update_one_ninja(data) 
    return redirect (f"/ninjas/{id}/show")

# Delete a ninja

@app.route("/ninjas/<int:id>/delete", methods=['get'])
def delete_ninja(id):
    data = {
        **request.form,
        'id':id
            }
    ninja.delete_one_ninja(data) 
    return redirect ("/")