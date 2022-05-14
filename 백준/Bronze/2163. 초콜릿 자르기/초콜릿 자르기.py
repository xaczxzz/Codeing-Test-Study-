M ,N = map(int,input().split())
count = N*M
res = 0
while True:
    if count == 1:
        print(res)
        break
    else:
        count-=1
        res +=1