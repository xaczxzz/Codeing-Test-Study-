while True:
    list_1 =input()
    A = list_1.lower()
    if list_1 == "#":
        break
    else:
        result = 0
        result +=A.count("a")
        result +=A.count("e")
        result +=A.count("i")
        result +=A.count("o")
        result +=A.count("u")
    print(result)