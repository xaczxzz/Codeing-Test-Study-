
N = int(input())
list = []
finish_list =[]
for i in range(0,2*N-1):
    if i <= N-1:
        list.append(input())
    else:
        finish_list.append(input())
list.sort()
finish_list.sort()



for i in range(len(finish_list)):
    if finish_list[i] != list[i]:
        print(list[i])
        exit()
print(list[-1])