N = int(input())
if N <2:
    print(N)
last = 0
current =1
for i in range(2,N+1):
    tmp = current
    current += last
    last = tmp
print(current)