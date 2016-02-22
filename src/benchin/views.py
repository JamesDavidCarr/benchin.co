from benchin import app


@app.route('/')
def hello():
    return "Hello, world!"

@app.route('/<name>')
def greet(name):
    return "Hello, {}".format(name)
