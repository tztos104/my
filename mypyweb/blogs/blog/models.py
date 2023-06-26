from django.db import models


# 카테고리 모델
class Category(models.Model):
    # unique 중복불허
    name = models.CharField(max_length=50, unique=True)

    # url-주소 allow_unicode 한글허용
    slug = models.SlugField(max_length=200, unique=True, allow_unicode=True)

    def __str__(self):
        return self.name

    # 카테고리 url 주소
    def get_absolute_url(self):
        return f'/blog/category/{self.slug}/'

    # 관리자 페이지에서 적용-verbose_name_plural 복수형
    class Meta:
        ordering = ['name']  # 이름순 정렬
        verbose_name = 'category'
        verbose_name_plural = 'categories'


class Post(models.Model):
    title = models.CharField(max_length=200) #제목
    content  = models.TextField() #내용
    pub_date = models.DateTimeField() #발행일
    modify_date = models.DateTimeField(null=True, blank=True)
    photo = models.ImageField(upload_to='blog/post/%Y/%m/%d/', null=True, blank=True)
    category = models.ForeignKey(Category, null=True, blank=True , on_delete=models.CASCADE)

    def __str__(self):
        return self.title