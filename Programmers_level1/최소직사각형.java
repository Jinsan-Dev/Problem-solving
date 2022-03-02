import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] >= sizes[i][1]){
                l.add(sizes[i][0]);
                s.add(sizes[i][1]);
            }else{
                s.add(sizes[i][0]);
                l.add(sizes[i][1]);
            }
        }
        
        return Collections.max(l)*Collections.max(s);
    }
}
