def solution(n):
    answer = list(str(n))
    answer = list(map(int, answer))
    res = 0
    for i in answer: res += i
    return res