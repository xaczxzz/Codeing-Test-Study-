test_case = int(input())
for i in range(1,test_case+1):
    A , B = map(int,input().split())
    M = A % 10
    if M == 1 or M == 5 or M == 6:
        print(M)
    elif M == 4 or M == 9:
        B = B % 2
        if B == 1:
            print(M)
        else:
            print((M * M) % 10)
    else:
        B = B % 4
        if B == 0:
            print((M**4) % 10 )
        else:
            print((M**B) %10)