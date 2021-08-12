import numpy as np

def solution(arr):
    if len(arr) == 1:
        arr.clear()
        arr.append(-1)
    else:
        m = np.min(arr)
        arr.remove(m)
    return arr