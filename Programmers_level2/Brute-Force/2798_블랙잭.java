import java.io.*;
import java.util.*;

public class Main {
    static int res = 0;
    static ArrayList<Integer> s = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //code
        int n = sc.nextInt();        // 바닥
        int m = sc.nextInt();        // 목표숫자
        
        int[] arr = new int[n];
        boolean[] check = new boolean[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        re(arr, check, m);
        
        System.out.println(res);
    }
    
    public static void re(int[] arr, boolean[] check, int aim){
        if(s.size() == 3){            // 루프 끝내는 조건
            int ans = 0;
            for(int i=0;i<s.size();i++){
                ans+=s.get(i);
            }
            if(ans > aim) return;
            if(ans > res) res = ans;
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(check[i]) continue;
            check[i] = true;
            s.add(arr[i]);
            re(arr, check, aim);
            check[i] = false;
            s.remove(s.size()-1);
        }
    }
}
