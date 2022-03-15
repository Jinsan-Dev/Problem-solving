import java.util.*;
import java.lang.Math;
class Solution {
    public int[] solution(int[] answers) {
        int f_cnt = 0; int f_ans = 1;
        int s_cnt = 0; int s_ans = 1;
        int t_cnt = 0; int[] t_ans = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int t_idx = 0;
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == f_ans){        // 1번
                f_cnt++;
            }
            if(f_ans == 5){ f_ans = 1; }
            else{ f_ans++; }
            
            if(i%2 == 0){                   // 2번
                if(answers[i] == 2){
                    s_cnt++;
                }
            }else{
                if(answers[i] == s_ans){
                    s_cnt++;
                }
                if(s_ans == 5){ s_ans = 1; }
                else if(s_ans == 1){ s_ans = 3;}
                else{ s_ans++; }
            }
        
            
            if(answers[i] == t_ans[t_idx]){ // 3번
                t_cnt++;
            }
            if(t_idx == 9){ t_idx = 0; }
            else{ t_idx++; }
        }
        
        
        int max = Math.max(Math.max(f_cnt, s_cnt), t_cnt);
        ArrayList<Integer> temp = new ArrayList<>();
        
        if(max == f_cnt){
            temp.add(1);
        }
        if(max == s_cnt){
            temp.add(2);
        }
        if(max == t_cnt){
            temp.add(3);
        }
        
        int[] res = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}
