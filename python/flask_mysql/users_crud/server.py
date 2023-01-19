from flask import Flask, render_template, request, redirect
from user import User
app = Flask(__name__)

@app.route("/")
def index():
    
    users = User.get_all()
    print(users)
    return render_template("index.html", users=users)

@app.route("/users/new")
def new_user_view():
    return render_template("new_user.html")

@app.route("/users/create", methods=['post'])
def create_user():
    print(request.form)
    new_user_id = User.insert_user(request.form)
    return redirect (f"/users/{new_user_id}/show")

@app.route("/users/<int:id>/show")
def select_one(id):
    data = {
        'id':id
    }
    this_user = User.select_one_user(data)
    return render_template("user_select_one.html",this_user=this_user) 

if __name__ == "__main__":
    app.run(debug=True, port=5003)