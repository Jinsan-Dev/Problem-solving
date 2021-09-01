def solution(lottos, win_nums):
    zero = lottos.count(0)
    c_cnt = 0
    
    for i in win_nums:
        if lottos.count(i) != 0:
            c_cnt+=1

    return getResult(zero, c_cnt)

def getResult(z,c):
    if z is 0 and c is 0:   high = 6
    else:   high = 7-z-c
    if c == 0:  low = 6
    else:   low = 7-c
    arr = []
    arr.append(high)
    arr.append(low)
    return arr


# 모범답안
def solution(lottos, win_nums):

    rank=[6,6,5,4,3,2,1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return rank[cnt_0 + ans],rank[ans]