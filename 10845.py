stack = []
for _ in range(int(input())):
    command = list(input())
    if command == 'push':
        stack.append(command[1])
        print(command[1])
    elif command == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            stack.pop()
            print(stack.pop())
    elif command == 'size':
        print(len(stack))
    elif command == 'empty':
        if len(command) == 0:
            print(1)
        else:
            print(0)
    elif command == 'front':
        if len(command) == 0:
            print(-1)
        else:
            print(stack[0])
    elif command == 'back':
        if len(command) == 0:
            print(-1)
        else:
            print(stack[-1])

    