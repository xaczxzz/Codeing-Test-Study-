def detaction(x, y, board, color):
    cnt = 0
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        

        if 0 <= nx < len(board) and 0 <= ny < len(board[0]):
            if board[nx][ny] == color:
                cnt += 1
    
    return cnt

def solution(board, h, w):
    answer = 0
    
    color = board[h][w]
    answer = detaction(h,w,board,color)
    return answer