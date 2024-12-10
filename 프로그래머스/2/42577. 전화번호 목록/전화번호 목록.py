def solution(phone_book):
    phone_dict = {}
    

    for number in phone_book:
        phone_dict[number] = True


    for number in phone_book:
        prefix = ""
        for digit in number[:-1]:  # 마지막 문자 제외
            
            prefix += digit
            if prefix in phone_dict:
                return False
    
    return True
