from flask import Flask, render_template, request

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

#짝수/홀수 판정 페이지
@app.route('/even_odd', methods = ['GET', 'POST'])
def even_odd():
    if request.method == "POST":
        try:
            num = int(request.form['num'])
        except ValueError:
            error_message = "숫자를 입력해주세요"
            return  render_template('even_odd.html', error_msg= error_message)
        else:
            if num % 2 == 0:
                result = "짝수입니다"
            else:
                result = "홀수 입니다."
                return render_template('calc_result.html', num=num, result=result)
    else:
        return render_template('even_odd.html')
    """
    if request.method == "POST":
        num = int(request.form['num'])
        if num % 2 == 0:
            result = "짝수입니다"
        else:
            result = "홀수 입니다."
        return render_template('calc_result.html', num=num, result=result)
    else: #request.method == "GET" 생략
        return render_template('even_odd.html')
 """
#회원가입페이지
@app.route('/register', methods = ['GET','POST'])
def register():
    if request.method == "POST":
        #데이터 가겨오기 -name 속성
        mid = request.form['memberid']
        pwd = request.form['passwd']
        name = request.form['name']
        gender = request.form['gender']

        return render_template('memberlist.html', mid=mid , pwd=pwd, gender=gender, name=name)
    else:
        return render_template('register.html')



app.run()