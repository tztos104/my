import sqlite3

def getconn():
    conn = sqlite3.connect("c:/my!/pyworks/pydb/mydb.db")
    return conn

def select():
    conn= getconn()
    cursor = conn.cursor() #모든 조작(삽입, 검색, 수정 , 삭제)을 수행하는 함수 cursor함수
    sql = "SELECT * FROM employee"
    cursor.execute(sql) #execute() 함수 담당
    #전체 검색 -fetchall(), 특정검색 - fetchone()
    rs = cursor.fetchall() #자료구조가 리스트임 개별요소는 튜플임
    for i in rs:
        print(i)
    conn.close()
    #print(rs)
def insert():
    conn = sqlite3.connect("c:/my!/pyworks/pydb/mydb.db")
    cursor = conn.cursor()
    sql="INSERT INTO employee VALUES ('e103', '안산', 22, 10000)"
    cursor.execute(sql)
    conn.commit() #삽입, 수정, 삭제 시에 반드시 커밋 해줌
    conn.close()

def udate():
    conn = sqlite3.connect("c:/my!/pyworks/pydb/mydb.db")
    cursor = conn.cursor()
    sql= "UPDATE employee SET age = 40 WHERE empid = 'e101'"
    cursor.execute(sql)
    conn.commit() #삽입, 수정, 삭제 시에 반드시 커밋 해줌
    conn.close()

def select_one(): #특정요소 검색
    conn = getconn()
    cursor = conn.cursor()
    sql= "SELECT * FROM employee WHERE empid = 'e103'"
    cursor.execute(sql)
    rs = cursor.fetchone()
    print(rs)
    conn.close()

def delete(): #특정요소 검색
    conn = getconn()
    cursor = conn.cursor()
    sql= "DELETE FROM employee WHERE empid = 'e102'"
    cursor.execute(sql)
    conn.commit()
    conn.close()


#udate()
#insert()
select()
#select_one()
#delete()