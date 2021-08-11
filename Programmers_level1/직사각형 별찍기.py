import sys

n, m = map(int, input().strip().split(' '))


for i in range(0,m):
    for j in range(0,n):
        print("*", end="")
    print("")