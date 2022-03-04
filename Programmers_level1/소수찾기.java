import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int n) {
        int cnt=1;
        for(int i=3;i<=n;i++){
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }
    
    public boolean isPrime(int a){
        for(int i=2;i<Math.sqrt(a)+1;i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}

-------------------------------------------

import math
def solution(n):
    prime = 0
    for i in range(2,n+1):
        if isPrime(i):
            prime+=1
    return prime

def isPrime(m):
    for i in range(2,int(math.sqrt(m))+1):
        if m%i == 0:
            return False
    return True
