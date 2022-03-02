class Solution {
    public long solution(int price, long money, int count) {
        long total = 0;
        for(int i=1;i<count+1;i++){
            total+=(i*price);
        }
        
        if(money >= total){
            return 0;
        }else{
            return total-money;
        }
    }
}
