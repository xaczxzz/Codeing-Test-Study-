from math import isqrt
from operator import index


flag  = True
count = 1

while flag:
    hate_list = []
    hater_list = []
    N = int(input())
    if N == 0:
        flag = False
        print("Group {0}",count)
    list_people = []
    for i in range(N):
        list_people.append(input().split())
    for j in range(1,N+1):
        if 'N' in [list_people[N-j][i]for i in range(N)]:
            hate_list.append(list_people[N-j][0])
            hater_index = list_people[N-j].index('N')-1
            hater_list.append(list_people[hater_index][0])    
        else:
            pass
            
            
print(hater_list)
print(hate_list)