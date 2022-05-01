N = input()
F = int(input())
M = int(N[:-2]+ "00")
while True:
    if M%F == 0:
        break
    M +=1
print(str(M)[-2:])