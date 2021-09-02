def solution(seoul):
    idx = 0
    for i, txt in enumerate(seoul):
        if "Kim" in txt:
            idx = i
            break
    return "김서방은 "+str(idx)+"에 있다"