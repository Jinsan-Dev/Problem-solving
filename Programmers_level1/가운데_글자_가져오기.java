import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        int idx = 0;
        if(arr.length % 2 == 0){
            idx = arr.length/2;
            return arr[idx-1]+arr[idx];
        }else{
            idx = arr.length/2;
            return arr[idx];
        }
    }
}
