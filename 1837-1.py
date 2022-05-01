P, K = map(int, input().split())

K -= 1                                  
a = [False, False] + [True] * (K - 1)
prime = []
for i in range(2, K + 1):
    if a[i]:
        prime.append(i)
        for j in range(2 * i, K + 1, i):
            a[j] = False
flag = True
for N in prime:
    if P% N == 0:
        flag = False       
        break
if flag:
    print("GOOD")
else:
    print("BAD",N)
print(prime)