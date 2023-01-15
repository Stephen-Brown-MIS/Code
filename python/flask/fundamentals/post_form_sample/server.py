from flask import Flask, render_template, request, redirect # added request and redirect
app = Flask(__name__)    # a new instance of the Flask class called "app"

@app.route('/')        
def index():
    return render_template("index.html") 


            
@app.route('/users', methods=['POST'])
def create_user():
    print("Got Post Info")
    print(request.form)
    return redirect('/')

if __name__=="__main__":   
    app.run(debug=True)    


