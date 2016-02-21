from flask import Flask

app = Flask(__name__)

from benchin import views
