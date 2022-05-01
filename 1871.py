time_case = int(input())
for i in range(1,time_case+1):
    alpabet , number = input().split('-')
    m = int(number)
    result = 0
    for i in range(3):
        result += (ord(alpabet[i])-65)*26**(2-i)
    if abs(result-m) <= 100:
        print("nice")
    else:
        print("not nice")
    