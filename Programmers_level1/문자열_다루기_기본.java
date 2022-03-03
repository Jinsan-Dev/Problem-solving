import java.util.*;

class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}

-------------------------------------------

def solution(s):
    if len(s) < 4 or 6 < len(s):
        return False
    if len(s) == 5:
        return False
    if "e" in s:
            return False
    if s.isdigit():
        return True
    else:
        try:
            tmp = float(s)
            return True
        except ValueError:
            return False
