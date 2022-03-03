import java.util.*;
class Solution {
    public String solution(int n) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                builder.append("수");
            }else{
                builder.append("박");
            }
        }
        return builder.toString();
    }
}
