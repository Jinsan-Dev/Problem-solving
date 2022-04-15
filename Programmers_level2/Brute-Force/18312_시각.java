import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        //code
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        
        for (int hour = 0; hour <= n; hour++){
            if(hour%10 == k || hour/10 == k){
                cnt+=3600;
            }else{
                for(int min = 0; min < 60; min++){
                    if(min%10 == k || min/10 == k) {
                        cnt+=60;
                    }else{
                        for(int sec = 0; sec < 60; sec++){
                            if (sec%10 == k || sec/10 == k) {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
