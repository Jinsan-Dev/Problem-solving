def solution(phone_number):
    rear = phone_number[-4:]
    newStr = ''
    for i in range(len(phone_number)):
        if(i+4 < len(phone_number)):
            newStr = newStr + "*"
    return newStr+rear