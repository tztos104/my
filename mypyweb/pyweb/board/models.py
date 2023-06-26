from django.db import models
from django.contrib.auth.models import User

class Question(models.Model):
    author = models.ForeignKey(User, on_delete=models.CASCADE) #글쓴이
    subject = models.CharField(max_length=200)   #제목
    content = models.TextField()                #질문내용
    create_date = models.DateTimeField()        #등록일
    modify_date = models.DateTimeField(null=True, blank=True) #수정일
    
    def __str__(self):
        return self.subject

#답변 모델(테이블)
class Answer(models.Model):
    author = models.ForeignKey(User, on_delete=models.CASCADE)
    content = models.TextField() #답변 내용
    cteate_date = models.DateTimeField() #등록일
    question = models.ForeignKey(Question, on_delete=models.CASCADE) #외래키
    modify_date = models.DateTimeField(null=True, blank=True)  # 수정일

    def __str__(self):
        return self.content
    

