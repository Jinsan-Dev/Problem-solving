def solution(n):
    word = list(str(n))
    word.sort(reverse=True)
    return int(''.join(word))