# testdb -> book
import sqlite3

def getconn():
    conn = sqlite3.connect("c:/my!/sql/SQlite/testdb.db")
    return conn

def create():
    conn = getconn()
    cursor = conn.cursor()
    sql = """
        CREATE TABLE book(
            book_no INTEGER PRIMARY KEY AUTOINCREMENT,
            title TEXT NOT NULL,
            author TEXT NOT NULL,
            page INTEGER
        )
    """
    cursor.execute(sql)
    conn.commit()
    conn.close()

def insert():
    conn = getconn()
    cursor = conn.cursor()
    sql = "INSERT INTO book(title, author, page)" \
          "VALUES (?, ?, ?)"
    #cursor.execute(sql, ('나는 누구일까', '김땡댕', 500))
    cursor.execute(sql, ('python projects', '켄 유엔스', 700))
    conn.commit()
    conn.close()

def select():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM book"
    cursor.execute(sql)
    rs = cursor.fetchall()
    print(rs)
    for i in rs:
        print(i) #(튜플로 출력)
    conn.close()

#책한권 검색
def select_one():
    conn = getconn()
    cursor = conn.cursor()
    #동적 바인딩 방식
    sql = "SELECT * FROM book WHERE book_no = ?"
    cursor.execute(sql, (2, )) #튜플 자료구조이미르 1개 사용시 쉼표 사용
    rs=cursor.fetchone()
    print(rs)
    conn.close()

def update():
    conn = getconn()
    cursor = conn.cursor()
    # 책번호가 2번인 페이지를 650페이지로 변경하기
    sql = "UPDATE book SET page = ? WHERE book_no = ?"
    cursor.execute(sql, (650, 2))
    conn.commit()
    conn.close()


def delete():
    conn = getconn()
    cursor = conn.cursor()
    #책번호가 3번인 책 삭제
    sql = "DELETE FROM book WHERE book_no = ? "
    cursor.execute(sql, (1,))
    conn.commit()
    conn.close()

#create()
#insert()
#update()
#select_one()
delete()
select()





print(getconn(), "연결객체 생성")