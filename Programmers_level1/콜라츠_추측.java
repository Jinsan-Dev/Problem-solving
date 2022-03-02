import java.util.*;
class Solution {
    public int solution(int num) {
        int answer = 0;
        long initVal = (long) num;          // 이런저런 계산 하다보면 오버플로우 발생
        while(initVal != 1){
            if(answer > 500){
                answer = -1;
                break;
            }
            if(initVal%2 == 0){
                initVal/=2;
            }else{
                initVal = 3*initVal + 1;
            }
            answer++;
        }
        
        return answer;
    }
}

-----------------------------------------

def solution(num):
    answer = 0
    while(num != 1):
        if num%2 == 0:
            num = num/2
        else:
            num = num*3+1
        
        if answer == 501:
            answer = -1
            break
        else:
            answer+=1
    return answer
