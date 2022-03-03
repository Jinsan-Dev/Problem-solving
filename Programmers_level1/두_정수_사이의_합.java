import java.util.*;
import java.lang.Math;

class Solution {
    public long solution(long a, long b) {
        if(a == b){ return a; }
        
        if((a>0 && b>0) || (a<0 && b<0)){
            boolean flag = true;
            long temp = 0;
            if(a<0 && b<0) { flag = false; }
        
            long big = Math.max(Math.abs(a),Math.abs(b));
            long small = Math.min(Math.abs(a),Math.abs(b));
            
            for(long i=small;i<big+1;i++){
                temp+=(long)i;
            }
            
            if(flag){
                return temp;
            }else{
                return temp*-1;
            }
        }else{
            long big = Math.max(a,b);
            long small = Math.min(a,b);
            long temp = 0;
            long answer = 0;
            
            if(big+small == 0){
                return 0;
            }else if(Math.abs(big) > Math.abs(small)){
                temp = Math.abs(small)+1;
                for(long i=(int)temp;i<(int)big+1;i++){
                    answer+=(long)i;
                }
            }else{
                temp = Math.abs(big)+1;
                for(long i=big;i<Math.abs(small)+1;i++){
                    answer+=(long)i;
                }
                answer*=-1;
            }
            return answer;
        }
    }
}
