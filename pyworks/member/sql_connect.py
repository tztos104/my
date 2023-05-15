import sqlite3

def getconn():
    conn =sqlite3.connect("c:/my!/pyworks/pydb/memberdb.db")
    return conn

print(getconn(), "연결객체 생성됨")
def create_board():
    conn = getconn()
    cursor =conn.cursor()
    sql = """
        CREATE TABLE board(
            bno INTEGER PRIMARY KEY AUTOINCREMENT,
            title TEXT NOT NULL,
            content TEXT NOT NULL,
            createdate DATETIME DEFAULT (datetime('now','localtime')),
            modifydate DATETIME,
            hit INTEGER DEFAULT 0,
            memberid TEXT NOT NULL,            
            FOREIGN KEY(memberid) REFERENCES member(memberid) ON DELETE CASCADE
        )
    
    """
    cursor.execute(sql)
    conn.commit()
    conn.close()
    print("테이블생성")

def insert():
    conn = getconn()
    cursor = conn.cursor()
    #동적 바인딩
    sql = "INSERT INTO board(title, content, memberid)\
                VALUES (?, ?, ?)"
    cursor.execute(sql,('가입인사','안녕하세요! 이영준입니다.','tztos104'))
    conn.commit()
    conn.close()

def drop_board():
    conn = getconn()
    cursor = conn.cursor()
    #동적 바인딩
    sql = "DROP TABLE board"
    cursor.execute(sql)
    conn.commit()
    conn.close()


def select_board():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM board"
    cursor.execute(sql)
    boardlist = cursor.fetchall()
    print(boardlist)
    for board in boardlist:
        print(board)
    conn.close()


#create_board()
#insert()
#drop_board()
select_board()

"""
def select():
    conn = getconn()
    cursor = conn.cursor()
    sql = " SELECT * FROM member"
    cursor.execute(sql) #검색 수행
    rs = cursor.fetchall()
    print(rs)
    for i in rs:
        print(i)
    conn.close()


def insert():
    conn = getconn()
    cursor = conn.cursor()
    #동적 바인딩
    sql = "INSERT INTO member(memberid, passwd, name, gender)\
                VALUES (?, ?, ?, ?)"
    cursor.execute(sql, ('today123', 'm12345@#','투데이','여'))
    conn.commit()
    conn.close()

def select_one():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "SELECT * FROM member WHERE memberid = ? AND passwd=?"
    cursor.execute(sql,('1','1') )
    rs = cursor.fetchone()
    print(rs)
    conn.close()
"""
#insert()
#select()
#select_one()
