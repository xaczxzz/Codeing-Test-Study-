import sys
A,B = map(int,input().split())
sum_list = []
k = 1
for i in range(1,B):
    for j in range(0,k):
        sum_list.append(i)
    k+=1
if A and B == 1:
    print(1)
else:
    print(sum(sum_list[A-1:B]))