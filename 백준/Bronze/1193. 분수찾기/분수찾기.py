X=int(input())

cross=1
while X>cross:
    X-=cross
    cross+=1
    
if cross%2==0:
    a=X
    b=cross-X+1
else:
    a=cross-X+1
    b=X
    
print(a, '/', b, sep='')