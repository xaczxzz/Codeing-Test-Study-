def solution(clothes):
    # 의상 종류별로 개수를 저장할 딕셔너리
    dict_cloth = {}
    

    for name, kind in clothes:
        if kind not in dict_cloth:
            dict_cloth[kind] = 1
        else:
            dict_cloth[kind] += 1
    

    answer = 1
    for count in dict_cloth.values():
        answer *= (count + 1)  
    

    return answer - 1
