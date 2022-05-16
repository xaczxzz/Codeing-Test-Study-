N = input()
answer = 0
st = []

for i in range(len(N)):
    if N[i] == '(':
        st.append('(')
    else:
        if N[i-1] == '(':
            st.pop()
            answer += len(st)
        else:
            st.pop()
            
            answer += 1
print(answer)