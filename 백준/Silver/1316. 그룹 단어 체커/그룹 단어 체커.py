N = int(input())
count =0
for i in range(N):
    M = input()
    result =[]
    for j in range(len(M)):
        if M[j] not in result:
            result.append(M[j])
        else:
            if M[j] != M[j-1]:
                break
            else:
                result.append(M[j])
    if len(result) == len(M):
        count +=1
print(count)