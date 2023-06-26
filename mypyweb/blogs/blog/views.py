from django.shortcuts import render

from blog.models import Post, Category


def index(request):
    return render(request, 'blog/index.html')

def post_list(request):
    post_list = Post.objects.all()
    categories = Category.objects.all()
    context = {'post_list':post_list, 'categories': categories}
    return render(request, 'blog/post_list.html', context)

def detail(request, post_id):
    post = Post.objects.get(id=post_id)
    context = {'post':post}
    return render(request, 'blog/detail.html', context)

#카테고리 페이지 처리 메서드
def category_page(request, slug) :
    current_category = Category.object.get(slug=slug) #현재 카테고리 검색
    post_list = Post.object.filter(category=current_category) #현 카테고리의 검색
    post_list = post_list.order_by('-pub_date') #날짜순 정렬
    categories = Category.objects.all() #전체키워드 탐색
    context = {'post_list':post_list, 'current_category':current_category,  'categories':categories}
    return render(request, 'blog/post_list.html', context)