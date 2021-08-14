def solution(s, n):
    answer = list(s)
    new = []
    for i in range(len(answer)):
        if answer[i] == ' ':
            new.append(" ")
            continue
        temp = ord(answer[i])   # ASCII code value
        if temp < 91:           # 입력값이 대문자
            if temp + n > 90:
                temp = temp + n - 26
            else:
                temp += n
        else:                   # 입력값이 소문자
            if temp + n > 122:
                temp = temp + n - 26
            else:
                temp += n
        new.append(chr(temp))
    return ''.join(new)


######## 모범답안

def caesar(s, n):
    s = list(s)
    for i in range(len(s)):
        if s[i].isupper():
            s[i]=chr((ord(s[i])-ord('A')+ n)%26+ord('A'))
        elif s[i].islower():
            s[i]=chr((ord(s[i])-ord('a')+ n)%26+ord('a'))

    return "".join(s)