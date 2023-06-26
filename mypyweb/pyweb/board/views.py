from django.http import HttpResponse
from django.shortcuts import render, redirect, get_object_or_404

from board.forms import QuestionForm, AnswerForm
from board.models import Question, Answer

from django.utils import timezone

from django.contrib.auth.decorators import login_required


def index(request):
   return render(request, 'board/index.html')

   # return HttpResponse("웹페이지 메인입니다.")

def question_list(request):
    question_list= Question.objects.all()
    context= {'question_list':question_list}
    return render(request, 'board/question_list.html',  context)

def detail(request, question_id):
    # question= Question.objects.get(id=question_id)
    question = get_object_or_404(Question, pk=question_id)
    context= {'question':question}
    return render(request, 'board/detail.html', context)

#질문 등록
@login_required(login_url='common:login')
def question_create(request):
    if request.method == 'POST':
        form = QuestionForm(request.POST) #입력된 데이터가 있는 폼
        if form.is_valid(): #폼이 유효하다면(유효성 검사
            question= form.save(commit=False) #가저장
            question.author = request.user #세션 권한 있는 글쓴이
            question.create_date = timezone.now()
            question.save()
            return redirect('board:question_list')

    else:
        form = QuestionForm() #폼객체 생성
    context= {'form':form}
    return render(request, 'board/question_form.html', context) #get 방식


#답변 등록
@login_required(login_url='common:login')
def answer_create(request, question_id):
    #질문이 1개 있어야 답변을 등록할 수 있음
    question= Question.objects.get(id=question_id)
    if request.method == 'POST':
        form = AnswerForm(request.POST)
        if form.is_valid():
            answer= form.save(commit=False) #content만 저장
            answer.author = request.user  # 세션 권한 있는 글쓴이
            answer.cteate_date = timezone.now()
            answer.question = question #외래키 생성
            answer.save()
            return redirect('board:detail', question_id = question.id)


    else:
        form = AnswerForm()
    context = {'question': question, 'form':form}
    return render(request,  'board/detail.html', context)

#질문삭제
@login_required(login_url='common:login')
def question_delete(request, question_id):
    # question= Question.objects.get(id=question_id)
    # 모델에서 데이터가 있으면 가져오고 없으면 404오류 처리
    question = get_object_or_404(Question, pk=question_id)
    question.delete()
    return redirect('board:question_list')

# 질문 수정
@login_required(login_url='common:login') #로그인 확인-> 로그인이 안되어 있음 login_url로 이동
def question_modify(request, question_id):
    question = get_object_or_404(Question, pk=question_id)
    if request.method =="POST":
        form = QuestionForm(request.POST, instance= question) #데이터가 이미 있는 폼
        if form.is_valid(): #가저장
            question =form.save(commit=False)
            question.modify_date = timezone.now() #수정일 추가등록
            question.author = request.user # 글쓴이 추가
            question.save()
            return  redirect('board:detail', question_id=question_id)
    else:
        form = QuestionForm(instance=question)
    context= {'form':form}
    return render(request, "board/question_form.html",  context)

# 답변 삭제
@login_required(login_url='common:login') #로그인 확인-> 로그인이 안되어 있음 login_url로 이동
def answer_delete(request, answer_id):
    answer = get_object_or_404(Answer, pk=answer_id)
    answer.delete()
    return redirect('board:detail', question_id=answer.question.id)


# 답변 수정
@login_required(login_url='common:login') #로그인 확인-> 로그인이 안되어 있음 login_url로 이동
def answer_modify(request, answer_id):
    answer = get_object_or_404(Question, pk=answer_id)
    if request.method =="POST":
        form = AnswerForm(instance= answer) #데이터가 이미 있는 폼
        if form.is_valid(): #가저장
            answer = form.save(commit=False)
            answer.modify_date = timezone.now() #수정일 추가등록
            answer.author = request.user # 글쓴이 추가
            answer.save()
            return  redirect('board:detail', question_id=answer.question.id)
    else:
        form = QuestionForm(instance=answer)
    context= {'form':form}
    return render(request, "board/detail.html",  context)