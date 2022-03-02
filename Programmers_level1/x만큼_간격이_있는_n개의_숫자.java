import java.util.*;
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i] = (long)((i+1)*x);
        }
        return answer;
    }
}

------------------------------------------------

def solution(x, n):
    answer = []
    for i in range(1,n+1):
        answer.append(x*i)
    return answer
