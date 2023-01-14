from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"

@app.route('/')        
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response

@app.route('/dojo') 
def dojo_world():
    return 'Dojo!'  # Return the string 'Dojo!' as a response for selection 

@app.route('/say/<name>')  
def hello_person(name):
    return 'Hi ' + name + '!'  # Return the string 'Hi' + name for the name variable specified in the address.

@app.route('/repeat/<int:number>/<name>') 
def repeat_things(number,name):
    return (name * number)  # Return a repeating string, using the number and name varaibles, as a response

if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.


