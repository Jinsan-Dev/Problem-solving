import java.util.*;
import java.lang.Math;

class Solution {
    public long solution(long n) {
        long sq = (long) Math.sqrt(n);
        if(n == Math.pow(sq,2)){
            return (long)(Math.pow(sq+1,2));
        }
        return -1;
    }
}

-----------------------------------------------

import math
def solution(n):
    if math.sqrt(n) % 1 != 0:
        return -1
    return (math.sqrt(n) + 1)**2
