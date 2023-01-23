from flask import Flask, render_template, request, redirect, session 
from comment import Comment
app = Flask(__name__)
app.secret_key = 'humptydumpty'

@app.route('/')
def start():
    return render_template("index.html")

@app.route('/process', methods=['POST'])         
def process():
    print(request.form)
    if not Comment.validate_comment(request.form):
        return redirect('/')
    Comment.insert_comment(request.form)
    return redirect("/show")
                                                        
@app.route('/show', methods=['GET'])         
def show_user():
    Comment.last_comment()
    return render_template("show.html")
                                                        

if __name__=="__main__":   
    app.run(debug=True)    


