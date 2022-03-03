import java.util.*;

class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        if(a > b){
            for(long i=b;i<=a;i++){
                answer+=i;
            }
        }else{
            for(long i=a;i<=b;i++){
                answer+=i;
            }
        }
        return answer;
    }
}

------------------------------
    
// 등차수열의 합 공식을 이용한 모범답안
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
