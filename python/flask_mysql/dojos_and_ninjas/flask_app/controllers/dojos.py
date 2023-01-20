# dojos.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.dojo import dojo

@app.route("/")
def index():
    dojos = dojo.get_all()
    print(dojos)
    return render_template("index.html", dojos=dojos)

# Show the new dojo screen

@app.route("/dojos/new")
def new_dojo_view():
    return render_template("new_dojo.html")

# Create the new dojo

@app.route("/dojos/create", methods=['post'])
def create_dojo():
    print(request.form)
    new_dojo_id = dojo.insert_dojo(request.form)
    return redirect (f"/dojos/{new_dojo_id}/show")

# Display a single dojo

@app.route("/dojos/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_dojo = dojo.select_one_dojo(data)
    return render_template("dojo_select_one.html",this_dojo=this_dojo) 

