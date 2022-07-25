A,B = map(int,input().split())
size = list(map(int,input().split()))
for i in range(len(size)):
    if size[i] < B:
        print(size[i],end=" ")
    else:
        pass