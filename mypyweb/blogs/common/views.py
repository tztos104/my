from django.shortcuts import render, redirect
from blog.form import UserForm
def signup(request):
    if request.method == "POST":

        form = UserForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('/')
    else:
        form = UserForm()
    context = {'form':form}
    return render(request, 'common/signup.html', context)
