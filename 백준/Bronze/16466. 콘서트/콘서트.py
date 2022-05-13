N = int(input())
ticket = sorted(list(map(int,input().split())))

for i in range(1,N+1):
    if ticket[i-1] != i:
        print(i)
        exit()
print(N+1)
