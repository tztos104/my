from django.contrib import admin
from poll.models import Question, Choice

# Question 클래스 등록
admin.site.register(Question)
admin.site.register(Choice)