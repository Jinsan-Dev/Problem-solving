import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = n;
        while(temp/10 >= 1){
            answer+=(temp%10);
            temp/=10;
        }
        return answer+temp;
    }
}

-----------------Python3 code------------------

def solution(n):
    answer = list(str(n))
    answer = list(map(int, answer))
    res = 0
    for i in answer: res += i
    return res
