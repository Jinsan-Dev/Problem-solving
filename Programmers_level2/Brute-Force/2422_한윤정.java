import java.io.*;
import java.util.*;

public class Main {
    static boolean[] chk;
    static int res = 0;
    static boolean[][] arr;
    static int[] com = new int[3];
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        //code
        int N = sc.nextInt();        //아이스크림 종류 개수 (1~N)
        int M = sc.nextInt();        //조합개수
        arr = new boolean[N][N];
        chk = new boolean[N];
        
        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1; int b = sc.nextInt()-1; // 1부터 시작이라 -1
            arr[a][b] = true; arr[b][a] = true;
        }
        
        cal(arr, 0, 0);
        
        System.out.println(res);
        
    }
    
    public static void cal(boolean[][] arr, int idx, int depth){
        if(depth == 3){
            if(check()) res++;
            return;
        }
        
        for(int i=idx;i<chk.length;i++) {
            if(!chk[i]){
                chk[i] = true;
                com[depth] = i;
                cal(arr, i, depth+1);
                chk[i] = false;
            }
        }
    }
    
    public static boolean check() {
        for(int i=0;i<2;i++){
            for(int j=i+1;j<3;j++){
                if (arr[com[i]][com[j]])
                    return false;
            }
        }
        return true;
    }
}
