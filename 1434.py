N , M  = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
result = 0
for i in range(0,N):
    result += A[i]
for j in range(0,M):
    result -= B[j]
print(result)