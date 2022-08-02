import sys
N = int(input())
result = 1
count =1
if N == 1:
    print(1)
    sys.exit(0)
while True:
    result += count*6
    if result <N:
        count +=1
    else:
        count +=1
        print(count)
        break
        