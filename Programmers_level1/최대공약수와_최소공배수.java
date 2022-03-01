import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[]{ gcd(n,m), lcm(n,m) };
        return answer;
    }
    
    public int gcd(int a, int b){ // 최대공약수
        int min = (int) Math.min(a,b);
        int max = (int) Math.max(a,b);
        for(int i=min;i>1;i--){
            if(max%i == 0 && min%i == 0){
                return i;
            }
        }
        return 1;
    }
    
    public int lcm(int a, int b){ // 최소공배수
        int gc = gcd(a,b);
        return (a*b)/gc;
    }
}

----------------------------------------------------

def solution(n, m):
    answer = []
    if min(n,m) == 1:
        answer.append(1)
        answer.append(n*m)
        return answer
    arr = []
    for i in range(min(n,m)+1):
        if n%(i+1) == 0 and m%(i+1) == 0:
            arr.append(i+1)
    answer.append(arr[-1])
    s = answer[0] * (n//answer[0]) * (m//answer[0])
    answer.append(s)
    return answer
