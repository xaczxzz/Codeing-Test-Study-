A , B = map(int,input().split())
if (A+B) < 0 or A-B < 0 or (A+B) % 2:
    print(-1)
else:
    i = (A+B)//2
    j = A - i
    print(max(i,j),min(i,j))