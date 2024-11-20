def solution(s):
    answer = 0
    
    s_list = list(s)

    x_cnt = 0
    y_cnt = 0
    for i in range(len(s_list)):
        if x_cnt ==0 and y_cnt ==0:
            x=s_list[i]
        
        if s_list[i] == x:
            x_cnt +=1
            if x_cnt == y_cnt:
                
                answer +=1 
                x_cnt = 0
                y_cnt = 0
        else:
            y_cnt +=1
            if x_cnt == y_cnt:
            
                answer +=1 
                x_cnt = 0
                y_cnt = 0
        if x_cnt != y_cnt and i == len(s_list)-1:
            answer +=1       
    
    
    return answer