import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> hash = new HashSet<>();
        int answer = 0;
        combination("", numbers, hash);
        Iterator iter = hash.iterator();
        while(iter.hasNext()){
            if(isPrime((int)iter.next())){
                answer++;
            }
        }
        return answer;
    }
    
    public void combination(String after, String before, HashSet<Integer> hash){
        if(!after.equals("")){
            hash.add(Integer.parseInt(after));
        }
        
        for(int i=0;i<before.length();i++){
            combination(after+before.charAt(i), before.substring(0,i) + before.substring(i+1), hash);
        }
    }
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num)+1;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
