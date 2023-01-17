from flask import Flask, render_template, request, redirect, session 
app = Flask(__name__)
app.secret_key = 'humptydumpty'

@app.route('/')
def add_one():
    if not "count" in session:
        session["count"]=0 
    session["count"] += 1
    return render_template("index.html", count_on_template=str(session["count"])) 

@app.route('/two')
def add_two():
    if not "count" in session:
        session["count"]=0 
    session["count"] += 2
    return render_template("index.html", count_on_template=str(session["count"])) 

@app.route("/destroy_session")
def destroy_count():
    session.pop("count", None)
    return redirect("/")

if __name__=="__main__":   
    app.run(debug=True)    


