import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> ans = new ArrayList<>();
    static boolean[] chk;
    static int n, k;
    
    public static void main(String[] args) throws IOException {
        //input
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());        //n장 중
        k = Integer.parseInt(sc.nextLine());        //k장 선택 (2~4)
        chk = new boolean[n];
        
        for(int i=0;i<n;i++)
            list.add(sc.nextLine());
        
        //code
        
        sol("", 0);
        
        System.out.println(ans.size());
        
    }
    
    public static void sol(String now, int cnt){
        if(cnt == k){
            if(!ans.contains(now)){
                ans.add(now);
            }
            return;
        }
        
        for(int i=0;i<n;i++){
            if(chk[i]) continue;
            chk[i] = true;
            sol(now + list.get(i), cnt+1);
            chk[i] = false;
        }
    }
}
