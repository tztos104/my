#hangman

import random

words = ['dog', 'cat', 'monkey', 'chicken', 'frog', 'horse']
lives_remaining = 10 #남은 기회(전역변수)

def pick_a_word():
    word = random.choice(words)
    return word

def get_guess():
    return 'a' #게이머가 항상 'a' 추축한다고 가정

def process_guess(quess, word):
    global lives_remaining #지역변수인데 전역변수화 함(global)
    lives_remaining -=1
    return False #True를 반환하면 바로 종료

def play():
    word = pick_a_word()
    while True:
        guess = get_guess()
        if process_guess(guess, word):
            print("You win! Well done")
            break
        else:
            print("You are Hung")
            print(("The word was: " + word))
            break


play()
