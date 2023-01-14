from flask import Flask, render_template  # Import Flask and render template
app = Flask(__name__)    # a new instance of the Flask class called "app"

@app.route('/')        
def open_checkerboard():
    return render_template("index.html",number1=8,number2=8)

# @app.route('/play/<int:number>')        
# def open_checkerboard2(number):
#     return render_template("index.html", number=number,color="lightblue") 

# @app.route('/play/<int:number>/<color>')        
# def open_checkerboard3(number, color):
#      return render_template("index.html",number=number,color=color) 


if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.


