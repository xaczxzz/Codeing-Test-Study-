from sys import stdin

sk1 = list(stdin.readline().strip())
sk2 = []
n = int(input())
for line in stdin:
    if line[0] == 'L':
        if sk1: sk2.append(sk1.pop())
        else: continue
    elif line[0] == 'D':
        if sk2:
            sk1.append(sk2.pop())
    elif line[0] == 'B':
        if sk1: sk1.pop()
        else: continue
    elif line[0] == 'P':
        sk1.append(line[2])
print("".join(sk1 + list(reversed(sk2))))