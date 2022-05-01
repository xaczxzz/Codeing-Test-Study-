count = int(input())
for i in range(count):
    C = int(input())
    Q = C//25
    D = (C%25)//10
    N = ((C%25)%10)//5
    P = (((C%25)%10)%5)//1
    print(Q, D, N, P)
