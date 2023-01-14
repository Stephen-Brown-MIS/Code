@app.route('/dojo')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Dojo!'  # Return the string 'Hello World!' as a response

@app.route('/say/<name>')          # The "@" decorator associates this route with the function immediately following
def hello_world(name):
    return 'Hi!' + name  # Return the string 'Hello World!' as a response

@app.route('/repeat/<int:number>/<name>')          # The "@" decorator associates this route with the function immediately following
def hello_world(number,name):
    return name * number  # Return the string 'Hello World!' as a response