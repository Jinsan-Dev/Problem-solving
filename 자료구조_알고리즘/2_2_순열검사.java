import java.util.*;
class Solution {
    public boolean solution(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length+1;i++)
            if(arr[i-1] != i) return false;
        
        return true;
    }
}
