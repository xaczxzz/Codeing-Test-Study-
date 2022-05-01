prime_number =[]
for i in range(2,1000001):
    if 1000001 %i ==0:
        prime_number.append(i)
print(prime_number)
for i in range(int(input())):
    S = int(input())
    if S % int(prime_number[0]) == 0:
        print("NO")
    elif S % int(prime_number[1]) == 0:
        print("NO")
    else:
        print("YES")
       