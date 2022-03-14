




-----------------------------------------------------
  
// 시도했지만 실패한 코드: 예외(테스트 1,5,13,14), 효율성 테스트 3,4 시간초과
  
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.length() - b.length();
            }
        });
        
        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<phone_book.length;j++){
                if(phone_book[j].equals(phone_book[i]) != true && phone_book[j].contains(phone_book[i])){
                    return false;
                }
            }
        }
        
        return true;
