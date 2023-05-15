import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Picnic Game",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)

    parser.add_argument('item',
                        metavar='str',
                        nargs='+', #인수를 1개 이상 전달함
                        help='Item(s) to bring')
    parser.add_argument('-s',
                        '--sorted',
                        action='store_true',
                        help='sort the items')

    return parser.parse_args() #명령줄 인수를 처리해서 반환함

def main():
    args = get_args()
    items =args.item
    #print(args.item)
    num =len(items)

    #정렬 기능 구현
    if args.sorted:
        items.sort()

    bringing = ''
    if num == 1:
        bringing = items[0] #bringing 변수에 1개 저장
    elif num == 2:
        bringing = ' and '.join(items)
    else:
        items[-1] = ' and ' + items[-1]
        bringing = ' , '.join(items)

    print('your are bringing {}'.format(bringing))



if __name__=="__main__":
    main()