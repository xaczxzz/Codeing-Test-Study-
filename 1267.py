Call_count = int(input())
Call_time = list(map(int,input().split()))
Y_time = Call_time
M_time = Call_time
Y = 0
M = 0
for i in range(Call_count):
    if Y_time[i] <= 29:
        Y += 10
    elif Y_time[i] >= 30 and Y_time[i] <=59:
        Y += 20
    else:
        Y += Y_time[i]//30 * 10 + 10
for i in range(Call_count):
    if M_time[i] <= 59:
        M += 15
    elif M_time[i] >= 60 and M_time[i] <= 119:
        M += 30
    else: 
        M += M_time[i]//60 * 15 +15
    
result_1 = Y
result_2 = M
if result_1 == result_2:
    print("Y M",result_2)
elif result_1 > result_2:
    print("M",result_2)
else:
    print("Y",result_1)