import java.util.*;
import java.lang.Math;
class Solution {
    public int[] solution(int[] arr) {
        int max = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
