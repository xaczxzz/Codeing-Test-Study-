from itertools import combinations

def solution(nums):
    answer = 0
    set_list = set(nums)
    if len(set_list) > len(nums)//2:
        return len(nums)//2
    else:
        return len(set_list)
        
        
        
