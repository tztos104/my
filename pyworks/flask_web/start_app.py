from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/season')
def get_season():
    season = "봄"
    seasonlist =['봄', '여름', '가을', '겨울']
    return render_template('season.html', season=season , seasons= seasonlist)

#requst(요청)- GET 방식(생략가능)
@app.route('/loopindex', methods = ['GET'])
def loopindex():
    items = ['a','b','c', 'd']
    return render_template('loopindex.html', items =items)


app.run()