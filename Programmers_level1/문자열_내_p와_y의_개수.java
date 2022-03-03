import java.util.*;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        int cnt = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("p")){
                cnt++;
            }else if(arr[i].equals("y")){
                cnt--;
            }
        }
        return cnt == 0;
    }
}

------------------------------------------------

def solution(s):
    print('Input: '+s)
    li = list(s.lower())
    p = li.count('p')
    y = li.count('y')
    if (p == 0 and y == 0) or p == y:
        return True
    else:
        return False
