#flask 웹 프레임워크 사용하기
import flask
from flask import Flask

app = Flask(__name__)

@app.route('/') #127.0.0.1:5000
def index():
    return "Hello~ Flask!"

app.run() #플라스크 서버 실행