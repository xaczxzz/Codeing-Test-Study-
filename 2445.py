A = int(input())
for i in range(1,A+1):
    print("*"*(i)+" "*(2*A-2*i)+"*"*(i))
for i in range(1,A):
    print("*"*(A-i)+ " "*(2*i)+"*"*(A-i))
        
