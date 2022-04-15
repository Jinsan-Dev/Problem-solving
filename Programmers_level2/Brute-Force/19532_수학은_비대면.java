import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        //input
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int d = sc.nextInt(); int e = sc.nextInt(); int f = sc.nextInt();
        
        //code
        for(int i=-999;i<1000;i++){
            for(int j=-999;j<1000;j++){
                if(a*i+b*j == c && d*i+e*j == f){
                     System.out.println(i +" "+j);
                }
            }
        }
    }
}
