arr = input()
count = [0]*26
for i in arr:
    count[ord(i)-97]+=1
print(*count)