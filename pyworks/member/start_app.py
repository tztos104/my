#컴트롤러 start_app
import sqlite3

from flask import Flask, render_template, request, redirect, url_for, session

app = Flask(__name__)
app.secret_key = "asddferfdgsfdg"

def getconn():
    conn =sqlite3.connect("c:/my!/pyworks/pydb/memberdb.db")
    return conn

getconn()

#url '/'로 경로 설정
@app.route('/')
def index():
    return render_template('index.html')
#회원 목록

@app.route('/memberlist', methods =['GET'])
def memberlist():

    conn = getconn()
    cursor = conn.cursor()
    sql = " SELECT * FROM member"
    cursor.execute(sql)  # 검색 수행
    rs = cursor.fetchall()
    conn.close()
    return render_template('memberlist.html', rs=rs)

#회원가입
@app.route('/register', methods = ['GET', 'POST'])
def register():
    if request.method == 'POST':
        #가입 폼에 입력된 자료 넘겨 받음
        id = request.form['memberid']
        pw = request.form['passwd1']
        name = request.form['name']
        gender = request.form['gender']
        #db에 저장
        conn= getconn()
        cursor = conn.cursor()
        sql =f"INSERT INTO member(memberid, passwd, name, gender)\
                VALUES ('{id}', '{pw}', '{name}', '{gender}')"
        session['userid'] = request.form['memberid']
        cursor.execute(sql)
        conn.commit()
        conn.close()

        return redirect('memberlist') #회원가입후 회원목록페이지로 이동
    else:
        return render_template('register.html')

    #로그인 페이지

@app.route( '/login', methods = ['GET', 'POST'])
def login():
    if request.method == "POST":
        #로그인폼에 입력된 데이터 넘겨 받음
        id = request.form['memberid']
        pw = request.form['passwd']

        conn = getconn()
        cursor = conn.cursor()
        # 동적 바인딩
        sql = f"SELECT * FROM member WHERE memberid = '{id}' AND passwd='{pw}'"
        cursor.execute(sql)
        rs = cursor.fetchone()
        print(rs)
        conn.close()
        if rs: #rs = true
            session['userid'] = rs[0] #memberid를 세션에 저장(세션 발급)
            return redirect(url_for('index'))
        else:
            error_msg = "아이디나 비밀번호를 확인해주세요"
            return render_template('login.html', error_msg=error_msg)
    else:
        return render_template('login.html')
@app.route( '/logout')
def logout():
    session.clear() #모든 세션 삭제
    return redirect(url_for('index'))

@app.route('/boardlist')
def boardlist():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM board ORDER BY createdate DESC"
    cursor.execute(sql)
    boardlist = cursor.fetchall()
    #print(boardlist)
    #for board in boardlist:
        #print(board)
    conn.close()
    return render_template('boardlist.html', boardlist= boardlist)


    #return render_template('boardlist.html', cart=cart, cartlist= cartlist)

#글쓰기
@app.route('/writing', methods=['GET', 'POST'])
def writing():
    if request.method == 'POST':
        #입력된 글을 가져오서 DB에 저장
        title = request.form['title'].replace("'","''")
        content = request.form['content'].replace("'","''")
        memberid = session.get('userid')
        conn = getconn()
        cursor = conn.cursor()
        # 동적 바인딩
        sql = f"INSERT INTO board(title, content, memberid) "\
                        f"VALUES ('{title}', '{content}', '{memberid}')"
        cursor.execute(sql)
        conn.commit()
        conn.close()

        return  redirect(url_for('boardlist'))
    else:
        return render_template('writing.html')

#글 상세보기
@app.route('/detail/<int:bno>', methods=['GET'])
def detail(bno):
    #DB board테이블에서 bno로 검색된 글 가져오기
    conn = getconn()
    cursor = conn.cursor()
    sql = f"SELECT * FROM board WHERE bno = {bno}"
    cursor.execute(sql)
    board = cursor.fetchone()#게시글 1개 가져옴
    #조회수 증가
    hit = board[4]
    sql = f"UPDATE board SET hit = {hit +1} WHERE bno= {bno}"
    cursor.execute(sql)
    conn.commit()
    conn.close()
    return render_template('detail.html', board=board)

#게시글 삭제
@app.route('/delete/<int:bno>', methods=['GET'])
def delete(bno):
    #삭제 요청한 글 번호를 DB board 테이블 삭제
    conn = getconn()
    cursor = conn.cursor()
    sql = f"DELETE FROM board WHERE bno = {bno}"
    cursor.execute(sql)
    conn.commit()
    conn.close()
    return  redirect(url_for('boardlist'))
#게시글 수정
@app.route('/update/<int:bno>', methods=['GET', 'POST'])
def update(bno):
    if request.method == "POST":
        #수정페이지에 수정한 입력한 내용ㅇ을 DB에 저장
        title = request.form['title'].replace("'","''")
        content = request.form['content'].replace("'","''")
        conn = getconn()
        cursor = conn.cursor()
        sql = f"UPDATE board SET title = '{title}', content = '{content}' WHERE bno={bno}"
        cursor.execute(sql)
        conn.commit()
        conn.close()

        return redirect(url_for('detail', bno=bno))
    else:
        #수정할 글을 db에서 가져옴
        conn = getconn()
        cursor = conn.cursor()
        sql = f"SELECT * FROM board WHERE bno = {bno}"
        cursor.execute(sql)
        board = cursor.fetchone()
        conn.commit()
        conn.close()
        return render_template('update.html', board=board)

app.run()