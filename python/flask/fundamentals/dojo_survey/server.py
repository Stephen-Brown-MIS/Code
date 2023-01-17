from flask import Flask, render_template, request, redirect, session 
app = Flask(__name__)
app.secret_key = 'humptydumpty'

@app.route('/')
def start():
    return render_template("index.html")

@app.route('/process', methods=['POST'])         
def process():
    print(request.form)
    session['yourName'] = request.form['yourName']   
    session['dojoLocation'] = request.form['dojoLocation']   
    session['favLanguage'] = request.form['favLanguage']   
    session['comments'] = request.form['comments']   
    return redirect("/show")
                                                        
@app.route('/show', methods=['GET'])         
def show_user():
    return render_template("show.html")
                                                        
@app.route("/destroy_session", methods=['GET'])
def destroy_session():
    session.pop('yourName', None)
    session.pop('dojoLocation', None)
    session.pop('favLanguage', None)
    session.pop('comments', None)
    return redirect("/")

if __name__=="__main__":   
    app.run(debug=True)    


