import argparse
import os
import sys

def get_args():
    parser = argparse.ArgumentParser(
        description='Howler (upper-cases input',
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
           )


    parser.add_argument('text',
                        metavar='text',
                        type=str,
                        help='Input string or file')
    
    parser.add_argument('-o',
                        '--outfile',
                        help='Output filename',
                        metavar='str',
                        type=str,
                        default=''
                        )
    
    
    args = parser.parse_args()
    if os.path.isfile(args.text):
        args.text = open(args.text).read().rstrip() #오른쪽 여백 삭제
    return args

def main():
    args = get_args()
    # print(args.text)
    #명령 인수가 -o 문자열이 있으면 파일을 생성 아니면 문자열 출력(stdout)
    out_fh = open(args.outfile, 'wt') if args.outfile else sys.stdout
    out_fh.write(args.text.upper()+'\n')

    out_fh.close()

if __name__== "__main__":
    main()
