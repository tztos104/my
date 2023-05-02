import sqlite3

def getconn():
    conn =sqlite3.connect("c:/my!/pyworks/pydb/memberdb.db")
    return conn

print(getconn(), "연결객체 생성됨")

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

#insert()
#select()
select_one()
