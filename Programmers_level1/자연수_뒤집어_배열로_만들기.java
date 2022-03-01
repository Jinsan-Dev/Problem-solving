import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        int[] answer = new int[arr.length];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(arr[answer.length-i-1]);
        }
        return answer;
    }
}

-------------------Python3 code---------------------------------

def solution(n):
    answer = list(str(n))
    answer.reverse()
    answer = list(map(int, answer))
    return answer
