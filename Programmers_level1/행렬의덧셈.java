import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x_axis = arr1[0].length;
        int y_axis = arr1.length;
        int[][] answer = new int[y_axis][x_axis];
        
        for(int i=0;i<y_axis;i++){
            for(int j=0;j<x_axis;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}

-------------------------------------------------------------

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
