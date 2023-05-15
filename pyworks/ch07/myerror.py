#사용자 예외만들기
#rasie -> 사용자 쪽에서 try-except
# Exception 클래스 상속

class MyError(Exception):
    def __str__(self):
        return "허용되지 않는 별명입니다."

def say_nick(nick):
    if nick == '바보':
        raise MyError()
    print(nick)
try:
    say_nick('영웅')
    say_nick('바보')
except MyError as e:
    print(e)