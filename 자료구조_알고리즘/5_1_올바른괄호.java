import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}


-----------------------------------------------------
  
import java.util.*;         --> 해당 코드가 상기 코드보다 6배 빠름
class Solution {
    boolean solution(String s) {
        int cnt = 0;
        for(char c: s.toCharArray()){
            if(c == '(') cnt++;
            else{
                if(cnt == 0) return false;
                cnt--;
            }
        }
        return cnt == 0;
    }
}
