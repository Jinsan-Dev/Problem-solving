def solution(x):
    if x == 10000:
        return True
    elif x > 999:       # 4자리 수
        fir = x//1000
        sec = (x%1000)//100
        thr = (x%100)//10
        forth = x%10
        if x%(fir+sec+thr+forth) == 0:
            return True
        else:
            return False
    elif x > 99:        # 3자리 수
        sec = (x%1000)//100
        thr = (x%100)//10
        forth = x%10
        if x%(sec+thr+forth) == 0:
            return True
        else:
            return False
    elif x > 9:         # 2자리 수
        thr = (x%100)//10
        forth = x%10
        if x%(thr+forth) == 0:
            return True
        else:
            return False
    else:
        return True

# 최고 깔끔한 풀이
# return n % sum([int(c) for c in str(n)]) == 0