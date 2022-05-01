A = int(input())
for i in range(1,A+1):
    print(" " *(i-1)+ "*" * (2*(A-i)+1))
for j in range(1,A):
    print(" "* (A - j -1) + "*" * ((2 * j) + 1))