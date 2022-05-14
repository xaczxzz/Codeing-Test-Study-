N ,M = list(map(int,input().split()))
big = []
small = []
count_1 = 0
count_2 = 0
count_3 = 0
giita_1 = 0
giita_2 = 0
giita_3 = 0
for i in range(M):
    price = list(map(int,input().split()))
    big.append(price[0])
    small.append(price[1])
big_num = min(big)
small_num = min(small)
time = N
while True:
    if giita_1 >= N:
        break
    giita_1 += 6
    count_1 += big_num
while True:
    if giita_2 >= N:
        break
    if time >= 6:
        time = time%6
        giita_2 += 6
        count_2 += big_num
    else:
        giita_2 += 1
        count_2 += small_num
while True:
    if giita_3 >= N:
        break
    giita_3 +=1
    count_3 +=small_num
print(min(count_1,count_2,count_3))

