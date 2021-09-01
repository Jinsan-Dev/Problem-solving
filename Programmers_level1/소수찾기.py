import math
def solution(n):
    prime = 0
    for i in range(2,n+1):
        if isPrime(i):
            prime+=1
    return prime

def isPrime(m):
    for i in range(2,int(math.sqrt(m))+1):
        if m%i == 0:
            return False
    return True