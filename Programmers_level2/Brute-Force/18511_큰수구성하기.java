import java.io.*;
import java.util.*;

public class Main {
    static int[] set;
    static int N, arrLen;
    static int ans = 0;
    static int Nlen;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //code
        N = sc.nextInt();
        Nlen = Integer.toString(N).length();
        
        arrLen = sc.nextInt();
        set = new int[arrLen];
        
        for(int i=0;i<arrLen;i++){
            set[i] = sc.nextInt();
        }
        
        solve(0, 0);
        
        System.out.println(ans);
    }
    
    public static void solve(int len, int now){
        if(len == Nlen){
            return;
        }
        
        now*=10;
        if(now > N) return;
        
        for(int i=0;i<arrLen;i++){
            int temp = now+set[i];
            if(temp > N) continue;
            if(temp > ans) ans = temp;
            solve(len+1, temp);
        }
    }
}
