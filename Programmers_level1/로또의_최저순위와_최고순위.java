import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt_zero = 0;
        int n = 0;
        int[] arr = {6, 6, 5, 4, 3, 2, 1};
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i] == 0){
                cnt_zero++;
            }
        }
        
        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(lottos[j] != 0 && win_nums[i] == lottos[j]){
                    n++;
                }
            }
        }
        
        int[] answer = { arr[cnt_zero+n], arr[n]};
        return answer;
    }
}

-----------------------------------------------------------
def solution(lottos, win_nums):
    zero = lottos.count(0)
    c_cnt = 0
    
    for i in win_nums:
        if lottos.count(i) != 0:
            c_cnt+=1

    return getResult(zero, c_cnt)

def getResult(z,c):
    if z is 0 and c is 0:   high = 6
    else:   high = 7-z-c
    if c == 0:  low = 6
    else:   low = 7-c
    arr = []
    arr.append(high)
    arr.append(low)
    return arr


# 모범답안
def solution(lottos, win_nums):

    rank=[6,6,5,4,3,2,1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return rank[cnt_0 + ans],rank[ans]
