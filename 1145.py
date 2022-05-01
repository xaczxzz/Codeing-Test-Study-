import sys
N = list(map(int,input().split()))
res = []
for i in range(5):
    for j in range(5):
        multi = N[i] *N[j]
        res.append(multi)
print(res)