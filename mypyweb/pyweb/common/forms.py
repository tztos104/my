from django import forms
from django.contrib.auth.forms import UserCreationForm

from django.contrib.auth.models import User


class UserForm(UserCreationForm):
    username = forms.CharField(max_length=20)
    email = forms.EmailField()
    address = forms.CharField(max_length=50)
    phone = forms.CharField(max_length=20)
    birth = forms.DateField()


    class Meta:
        model = User
        fields = ['username',  'email', 'address', 'phone', 'birth']
        labels = {'username': '사용자이름' ,  'email': '이메일', 'address':'주소', 'phone':'전화번호', 'birth':'생년월일'}