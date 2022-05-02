

N = int(input())
ans = []
for i in range(N):
    ans.append(input())
result = set(ans)
result = list(result)
r2 =sorted(result)
for i in range(len(r2)):
    print(min(r2),"결과")
    r2.remove(min(r2))
# 다시풀어야됌