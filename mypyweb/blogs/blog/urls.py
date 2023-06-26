
from django.contrib import admin
from django.urls import path

from . import views

app_name = 'blog'
urlpatterns = [
    path('', views.post_list, name='post_list'),
    path('<int:post_id>', views.detail, name='detail'),
    path('category/<str:sug>/', views.category_page, name='category_page'),
]

