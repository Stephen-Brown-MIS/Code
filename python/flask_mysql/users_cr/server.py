from flask import Flask, render_template, request, redirect
# import the class from friend.py
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
    User.insert_user(request.form)
    return redirect ("/")

if __name__ == "__main__":
    app.run(debug=True, port=5001)