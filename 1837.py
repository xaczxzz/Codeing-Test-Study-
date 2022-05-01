N , K = map(int,input().split())
if N/K > K:
    while True:
        K += 1
        if N%K == 0:
            print("GOOD")
            break            
else:
    while True:
        K -= 1
        if N%K == 0:
            Q = N/K
            if K< Q:
                print("BAD",int(K))
            else:
                print("BAD",int(Q))
        break           