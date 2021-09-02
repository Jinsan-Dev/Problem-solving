def solution(s):
    if len(s) < 4 or 6 < len(s):
        return False
    if len(s) == 5:
        return False
    if "e" in s:
            return False
    if s.isdigit():
        return True
    else:
        try:
            tmp = float(s)
            return True
        except ValueError:
            return False