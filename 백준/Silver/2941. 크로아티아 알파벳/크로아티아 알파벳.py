N = input()
res =0
res +=N.count('c=')
res +=N.count('c-')
res +=N.count('dz=')
res +=N.count('d-')
res +=N.count('lj')
res +=N.count('nj')
res +=N.count('s=')
res +=N.count('z=')
if len(N)-res ==0:
    print(res)
else:
    print(len(N)-res)