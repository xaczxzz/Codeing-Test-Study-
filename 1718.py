alphabet = 'abcdefghijklmnopqrstuvwxyz'
print(alphabet.index('l'))
sentence = input()
cypher = input()
result = ""
print(sentence)
for i in range(0,len(sentence)+1):
    if sentence[i]  == " ":
        result += " "
        continue
    else:
        value = alphabet.index(sentence[i]) - alphabet.index(cypher[i])
        if value < 0:
            value += 26
            result += alphabet[value]
        else:
            result += alphabet[value]
print(result)