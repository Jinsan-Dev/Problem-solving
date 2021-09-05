def solution(s):
    print('Input: '+s)
    li = list(s.lower())
    p = li.count('p')
    y = li.count('y')
    if (p == 0 and y == 0) or p == y:
        return True
    else:
        return False