N = int(input())
round1 = list(map(int,input().split()))
round2 = list(map(int,input().split()))
result = 0
for i in range(N):
    if 0 < round1[i]:
        result += round1[i]
    else:
        result += -1*round1[i]
    if 0 < round2[i]:
        result += round2[i]
    else:
        result += -1*round2[i]
print(result)