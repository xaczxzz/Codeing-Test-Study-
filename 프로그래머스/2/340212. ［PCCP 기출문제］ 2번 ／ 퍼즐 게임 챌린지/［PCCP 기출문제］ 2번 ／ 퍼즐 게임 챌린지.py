def solution(diffs, times, limit):
    def can_solve_with_level(level):
        total_time = 0
        prev_time = 0
        
        for diff, time in zip(diffs, times):
            if level >= diff:
                total_time += time
            else:
                mistakes = diff - level
                total_time += mistakes * (time + prev_time) + time
            
            if total_time > limit:
                return False
            
            prev_time = time
        
        return total_time <= limit

    # 이진 탐색으로 최소 숙련도 찾기
    left, right = min(diffs), max(diffs)
    while left < right:
        mid = (left + right) // 2
        if can_solve_with_level(mid):
            right = mid  # 더 낮은 숙련도로 가능한지 탐색
        else:
            left = mid + 1  # 더 높은 숙련도가 필요
        
    return left
