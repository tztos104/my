from django.contrib import admin

from blog.models import Category



#카테고리 등록
class CategoryAdmin(admin.ModelAdmin):
    prepopulated_fields = {'slug':('name',)} #name은 튜플



admin.site.register(Category) # 카테고리 모델 등록
