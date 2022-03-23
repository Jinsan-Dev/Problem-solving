import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int choose = nums.length/2;
        
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }
        
        if(hash.size() >= choose){
            return choose;
        }else{
            return hash.size();
        }
    }
}
