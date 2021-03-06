import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String name = "";
        
        for(int i=0;i<participant.length;i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1); // 기존 값이 있으면 value를 핸들링 할 수 있음
        }
        
        for(int i=0;i<completion.length;i++){
            map.put(completion[i], map.get(completion[i])-1);
        }

        for(int i=0;i<participant.length;i++){
            if(map.get(participant[i]) != 0){
                name = participant[i];
                break;
            }
        }
        return name;
    }
}

----------------------------------------------------------
# 다른풀이법

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<participant.length;i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        for(String c: completion){
            int temp = map.get(c)-1;
            if(temp == 0) map.remove(c);
            else map.put(c, temp);
        }

        return map.keySet().iterator().next();
    }
}
