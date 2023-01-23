# dojos.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.dojo_model import Dojo

# Show the new dojo screen ----- VIEW

@app.route("/")
def index():
    dojos = Dojo.get_all()
    print("*************   dojos controller ********************")
    for attribute in dir(dojos):
        print(attribute)
    return render_template("index.html", dojos=dojos)

# Show the new dojo screen ----- VIEW

@app.route("/dojos/new")
def new_dojo_view():
    dojos = Dojo.get_all()
    return render_template("index.html", dojos=dojos)

# Create the new dojo ------     ACTION

@app.route("/dojos/create", methods=['post'])
def create_dojo():
    print(request.form)
    dojo_id = Dojo.insert_dojo(request.form)
    return redirect ("/dojos/new")

# Display a single dojo -----    VIEW

@app.route("/dojos/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_dojo = Dojo.select_one_dojo(data)
    print(this_dojo)
    return render_template("dojo_detail.html",this_dojo=this_dojo) 

