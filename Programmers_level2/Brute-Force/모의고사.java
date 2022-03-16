import java.util.*;
import java.lang.Math;
class Solution {
    public int[] solution(int[] answers) {
        int f_cnt = 0; int[] f_ans = { 1, 2, 3, 4, 5 };
        int s_cnt = 0; int[] s_ans = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int t_cnt = 0; int[] t_ans = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == f_ans[i%5]){        // 1번
                f_cnt++;
            }
            
            if(answers[i] == s_ans[i%8]){        // 2번
                s_cnt++;
            }
        
            if(answers[i] == t_ans[i%10]){       // 3번
                t_cnt++;
            }
        }
       
        int max = Math.max(Math.max(f_cnt, s_cnt), t_cnt);
        ArrayList<Integer> temp = new ArrayList<>();
        
        if(max == f_cnt){ temp.add(1); }
        if(max == s_cnt){ temp.add(2); }
        if(max == t_cnt){ temp.add(3); }
        
        int[] res = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}
