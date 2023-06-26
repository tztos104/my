
from django.contrib import admin
from django.urls import path, include

from board import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.index),
    path('board/', include('board.urls')),
    path('common/', include('common.urls')),
]
