#hangman

import random

words = ['dog', 'cat', 'monkey', 'chicken', 'frog', 'horse']
lives_remaining = 10 #남은 기회(전역변수)
quessed_letters = ''

def pick_a_word():
    word = random.choice(words)
    return word

def get_guess(word):
    print_word_with_blanks(word)
    print('lives remaining :'+ str(lives_remaining))
    geuss = input("Guess a letter or whole word?")
    return geuss

def print_word_with_blanks(word):
    #print("아직구현되지 않음")
    display_word = ''
    for letter in word:
        if quessed_letters.find(letter) > -1: #글자를 찾음
            display_word += letter #단어를 추가해서 저장
        else:
            display_word +=  "-"
    print(display_word)


def process_guess(quess, word):
    global lives_remaining #지역변수인데 전역변수화 함(global)
    global quessed_letters

    lives_remaining -= 1
    quessed_letters += quess #컴이 추측한 단어에 게이머가 입력한 글자가 추가됨
    if quess == word:
        return True
    return False #True를 반환하면 바로 종료

def play():
    word = pick_a_word()
    while True:
        guess = get_guess(word)
        if process_guess(guess, word):
            print("You win! Well done")
            break
        if lives_remaining == 0:
            print("You are Hung")
            print(("The word was: " + word))
            break


play()

