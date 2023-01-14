from flask import Flask, render_template  # Import Flask and render template
app = Flask(__name__)    # a new instance of the Flask class called "app"

@app.route('/play')        
def open_playground():
    return render_template("index.html",number=3,color="lightblue") #render template will look to template folder

@app.route('/play/<int:number>')        
def open_playground2(number):
    return render_template("index.html", number=number,color="lightblue") 

@app.route('/play/<int:number>/<color>')        
def open_playground3(number, color):
     return render_template("index.html",number=number,color=color) 


if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.


