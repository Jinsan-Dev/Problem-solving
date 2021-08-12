def solution(n, m):
    answer = []
    if min(n,m) == 1:
        answer.append(1)
        answer.append(n*m)
        return answer
    arr = []
    for i in range(min(n,m)+1):
        if n%(i+1) == 0 and m%(i+1) == 0:
            arr.append(i+1)
    answer.append(arr[-1])
    s = answer[0] * (n//answer[0]) * (m//answer[0])
    answer.append(s)
    return answer