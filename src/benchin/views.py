from benchin import app


@app.route('/')
def hello():
    return "Hello, world!"