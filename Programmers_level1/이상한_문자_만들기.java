//   print(arr) 은 arr의 object value 즉, 주소값을 반환한다.
//   다만 print(arr[i]) 은 해당 자리의 문자열을 가져오므로,
//   arr[i].toUpperCase() 는 대문자를 반환하게 된다.

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        String[] arr = s.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" ")){
                answer.append(" ");
                idx = 0;
                continue;
            }else{
                idx++;
                if(idx%2 == 1){
                    answer.append(arr[i].toUpperCase());
                }else{
                    answer.append(arr[i].toLowerCase());
                }
            }
        }
        return answer.toString();
    }
}
