def solution(arr1, arr2):
    answer = []
    s = len(arr1)
    g = len(arr1[0])
    
    for i in range(s):
        line = []
        for j in range(g):
            line.append(0)
        answer.append(line)
        
    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            answer[i][j] = arr1[i][j] + arr2[i][j]
    
    return answer