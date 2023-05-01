#컴트롤러 start_app

from flask import Flask, render_template

app = Flask(__name__)

#url '/'로 경로 설정
@app.route('/')
def index():
    return render_template('index.html')

app.run()