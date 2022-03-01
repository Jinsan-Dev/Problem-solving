import java.util.*;

class Solution {
    public long solution(long n) {
        String str = ""+n;
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        str = "";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        long answer = Long.parseLong(str);
        return answer;
    }
}

--------------------------------------------------

def solution(n):
    word = list(str(n))
    word.sort(reverse=True)
    return int(''.join(word))
