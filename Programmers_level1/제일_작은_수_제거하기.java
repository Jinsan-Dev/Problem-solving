import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }else{
            int min = arr[0];
            int[] answer = new int[arr.length-1];
            for(int i=1;i<arr.length;i++){
                min = Math.min(min, arr[i]);
            }
            
            int idx=0;
            
            for(int i=0;i<answer.length;i++){
                if(arr[idx] == min){
                    idx++;
                    i--;
                    continue;
                }
                answer[i] = arr[idx];
                idx++;
            }
            return answer;
        }
    }
}

------------------------------------------------------------

import numpy as np

def solution(arr):
    if len(arr) == 1:
        arr.clear()
        arr.append(-1)
    else:
        m = np.min(arr)
        arr.remove(m)
    return arr
