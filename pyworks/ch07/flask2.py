from flask import Flask

app = Flask(__name__)

@app.route("/")  #127.0.0.1:5000
def hello_world():
    return "<p>Hello, World!</p>"

@app.route('/login')  #127.0.0.1:5000/login
def login():
    return "<h1>로그인 페이지 입니다.</h1>"

@app.route('/board/view')
def detail():
    return "<h1>게시판 상세 페이지</h1>"

app.run()