def detaction(x, y, size, park):
   
    if x + size > len(park) or y + size > len(park[0]):
        return False
    
   
    for i in range(x, x + size):
        for j in range(y, y + size):
            if park[i][j] != "-1":  
                return False
    return True

def solution(mats, park):

    mats.sort(reverse=True)
    
    for k in mats:
        for i in range(len(park)):
            for j in range(len(park[i])):

                if detaction(i, j, k, park):
                    return k  
    return -1  # 아무 돗자리도 깔 수 없는 경우
