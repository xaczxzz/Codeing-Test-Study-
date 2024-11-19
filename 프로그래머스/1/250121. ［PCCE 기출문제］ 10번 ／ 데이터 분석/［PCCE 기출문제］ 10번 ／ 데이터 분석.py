def solution(data, ext, val_ext, sort_by):
    sorted_array = []
    
    # ext에 해당하는 조건을 기준으로 필터링
    for i in data:
        if ext == "date" and val_ext > i[1]:
            sorted_array.append(i)
        elif ext == "code" and val_ext > i[0]:
            sorted_array.append(i)
        elif ext == "maximum" and val_ext > i[2]:
            sorted_array.append(i)
        elif ext == "remain" and val_ext > i[3]:
            sorted_array.append(i)

    # sort_by에 해당하는 기준으로 오름차순 정렬
    if sort_by == "code":
        sorted_array = sorted(sorted_array, key=lambda x: x[0])
    elif sort_by == "date":
        sorted_array = sorted(sorted_array, key=lambda x: x[1])
    elif sort_by == "maximum":
        sorted_array = sorted(sorted_array, key=lambda x: x[2])
    elif sort_by == "remain":
        sorted_array = sorted(sorted_array, key=lambda x: x[3])

    return sorted_array
