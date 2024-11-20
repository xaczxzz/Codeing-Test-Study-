def solution(t, p):
    answer = 0
    answer_list = []
    t_list = list(t)
    for i in range(len(t)-len(p)+1):
        score = ""
        for j in range(i,len(p)+i):
            print(t_list[j])
            score += t_list[j]    
        
        if int(score) <= int(p):
            answer +=1
    return answer