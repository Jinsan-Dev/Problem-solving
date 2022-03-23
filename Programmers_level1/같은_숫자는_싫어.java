import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 0;
        answer.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(answer.get(cnt) == arr[i]){
                continue;
            }else{
                answer.add(arr[i]);
                cnt++;
            }
        }
        
        int [] dap = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            dap[i] = answer.get(i);
        }

        return dap;
    }
}

---------------------------------------------------------
# 모범답안


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int idx = 0;
        for(int a: arr){
            if(list.get(idx) != a){
                list.add(a);
                idx++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
