class Solution {
    public double solution(int[] arr) {
        int add = 0;
        for(int i=0;i<arr.length;i++){
            add+=arr[i];
        }
        return (double) add/arr.length;
    }
}

-----------------------------------------

import numpy as np

def solution(arr):
    answer = np.mean(arr)
    return answer
