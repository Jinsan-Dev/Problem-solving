import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

---------------------------------------------------

import sys

n, m = map(int, input().strip().split(' '))

for i in range(0,m):
    for j in range(0,n):
        print("*", end="")
    print("")
