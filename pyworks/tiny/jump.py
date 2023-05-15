import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Jump the Five",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)

    parser.add_argument('text',
                        metavar = 'str',
                           help='Input text')

    return parser.parse_args() #명령줄 인수를 처리해서 반환함

def main():
    args = get_args()
    jumper =  {
  '1': '9',
  '2': '8',
  '3': '7',
  '4': '6',
  '5': '0',
        '0': '5',
  '6': '4',
  '7': '3',
  '8': '2',
  '9': '1'
}
    #방법 1
    for char in args.text:
        print(jumper.get(char, char), end='')









if __name__=="__main__":
    main()