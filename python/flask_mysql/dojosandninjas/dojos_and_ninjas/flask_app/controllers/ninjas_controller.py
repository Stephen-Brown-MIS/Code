# ninjas.py
from flask_app import app
from flask import render_template,redirect,request,session,flash
from flask_app.models.ninja_model import Ninja
from flask_app.models.dojo_model import Dojo


@app.route("/ninjas/new")
def new_ninja_view():
    dojos=Dojo.get_all()
    print("*******  test point *******")
    print(dojos)
    return render_template("new_ninja.html",dojos=dojos)

# Create the new ninja  ----------  ACTION

@app.route("/ninjas/create", methods=['post']) 
def create_ninja():
    print(f"\n ****** \n {request.form} \n ****** \n")
    new_ninja_id = Ninja.insert_ninja(request.form)
    dojo_id=request.form["dojo_id"]
    return redirect (f"/dojos/{dojo_id}/show")

# Read all ninjas, send to dojo detail screen -----   VIEW

@app.route("/ninjas")
def select_all_ninjas(id):
    all_ninjas = Ninja.get_all_ninjas()
    return render_template("dojo_detail.html",all_ninjas=all_ninjas) 

