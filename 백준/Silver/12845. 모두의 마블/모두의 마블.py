N = int(input())
level = list(map(int,input().split()))
result = 0
big_num = []
big_num.append(max(level))
level.remove(max(level))
for i in range(N-1):
    result += level[i]+big_num[0]
    
print(result)