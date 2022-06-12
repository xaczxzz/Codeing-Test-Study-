N = int(input())
result = []
for i in range(N):
    score = 0
    plus = 0
    list_ = input()
    for j in range(0,len(list_)):
        if list_[j] == "O":
                plus +=1
                score += plus
        else:
            plus = 0
    result.append(score)
for i in range(N):
    print(result[i])