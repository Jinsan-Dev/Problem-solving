import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1; 
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        if(map.size() == 1){
            return map.get(clothes[0][1]);
        }else{
            for(String key : map.keySet()){
                answer*=(map.get(key)+1);
            }
            return answer-1;
        }
    }
}
