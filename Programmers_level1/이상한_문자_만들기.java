import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")){
                continue;
            }
            StringBuilder temp = new StringBuilder(arr[i]);
            for(int j=0;j<temp.length();j++){
                if(j%2 == 0){
                    temp.setCharAt(j, makeUpper(temp.charAt(j)));
                }else if(j%2 != 0){
                    temp.setCharAt(j, makeLower(temp.charAt(j)));
                }
            }
            answer.append(temp.toString()+" ");
        }
        answer.deleteCharAt(answer.length()-1);
        return answer.toString();
    }
    
    public char makeUpper(char s){
        return Character.toUpperCase(s);
    }
    
    public char makeLower(char s){
        return Character.toLowerCase(s);
    }
}
