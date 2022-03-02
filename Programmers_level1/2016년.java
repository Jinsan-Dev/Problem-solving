import java.util.*;
class Solution {
    public String solution(int a, int b) {
        int days = 0;
        if(a != 1){
            for(int i=1;i<a;i++){
                days+=calDay(i);
            }
        }
        days+=b;
        days%=7;
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        return week[days];
    }
    
    public int calDay(int mon){
        ArrayList<Integer> mon31 = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
        ArrayList<Integer> mon30 = new ArrayList<>(Arrays.asList(4,6,9,11));
        if(mon31.contains(mon)){ return 31; }
        else if(mon30.contains(mon)){ return 30; }
        else{ return 29; }
    }
}
