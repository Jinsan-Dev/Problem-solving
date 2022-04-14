import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int aim = Integer.parseInt(str);
        int len = str.length();
        
        int res=0;
        
        for(int i=aim-(len*9);i<aim;i++){
            String[] temp = Integer.toString(i).split("");
            for(int j=0;j<temp.length;j++){
                res+=Integer.parseInt(temp[j]);
            }
            
            if(i+res == aim){
                res = i;
                break;
            }else{
                res = 0;
            }
        }
        
        System.out.println(res);
        
    }
    
    
}
