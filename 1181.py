import sys

N = int(sys.stdin.readline())
words = []
for i in range(N):
    words.append(sys.stdin.readline().strip())
set_words = set(words)
words = list(set_words)

words.sort(key= len)

for i in range(len(words)):
    print(words[i])