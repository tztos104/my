from django.http import HttpResponse
from django.shortcuts import render
from poll.models import Question


def index(request):
    return render(request, 'poll/index.html')

# Create your views here.
def poll_list(request):
    question_list = Question.objects.all()
    return render(request, 'poll/poll_list.html', {'question_list': question_list})
    # return HttpResponse("<h1>안녕~~! Django</h1>")


def test(request):
    cart = "계란"  # 모델(데이터) - 딕셔너리형으로 보냄
    cartlist = ["계란", "콩나물", "칫솔", "치약", "햇반", "고구마", "닭도리탕", "칼국수", "샤브샤브"]
    context = {'cart': cart, 'cartlist': cartlist}
    return render(request, 'poll/test.html', context)


def detail(request, question_id):
    question = Question.objects.get(id=question_id)
    return render(request, 'poll/detail.html', {'question': question})

def vote(request, question_id):
    question = Question.objects.get(id=question_id)
    if request.method == "POST":
        try:
            choice_id = request.POST['choice'] #선택된 항목 아이디
            sel_choice = question.choice_set.get(id=choice_id) #아이디로 항목을 찾아서
        except:
            error = "선택을 하지 않았습니다."
            return render(request, 'poll/detail.html', {'question': question, 'error': error})
        else:
            sel_choice.votes += 1
            sel_choice.save() #저장 필수
            return render(request, 'poll/result.html', {'question': question})
    else:
        return render(request, 'poll/detail.html', id=question_id)

