import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //code
        int how_many = sc.nextInt();
        int aim = sc.nextInt();
        int fun = sc.nextInt();        // 뻔:0 데기:1
        int cnt=1;
        int order = 0;
        
        while(true){
            int[] temp = new int[4+2*(cnt+1)];
            temp[0]=0;temp[1]=1;temp[2]=0;temp[3]=1;
            for(int i=4;i<cnt+5;i++) temp[i] = 0;
            for(int i=cnt+5;i<temp.length;i++) temp[i] = 1;
                
            for(int i=0;i<temp.length;i++){
                if(temp[i] == fun){
                    aim--;
                    if(aim==0){
                        break;
                    }
                }
                order++;
            }
            order%=how_many;
            cnt++;
            if(aim == 0) break;
        }
        
        order%=how_many;
        
        System.out.println(order);
        
    }
}
