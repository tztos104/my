from django import forms

from board.models import Question, Answer

from django.contrib.auth.forms import UserCreationForm

from django.contrib.auth.models import User


class QuestionForm(forms.ModelForm):
    class Meta:
        model = Question
        fields = ['subject', 'content']
        labels = {'subject': '제목', 'content': '내용'}


class AnswerForm(forms.ModelForm):
    class Meta:
        model = Answer
        fields = ['content']
        labels = {'content': '답변 내용'}


