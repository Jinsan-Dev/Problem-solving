import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int cost = 0;
        int cnt = 0;
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            if(cost+d[i] <= budget){
                cost+=d[i];
                cnt++;
                if(cost == budget){
                    break;
                }
            }else{
                break;
            }
        }
        return cnt;
    }
}
