import java.io.*;
import java.util.*;

public class Solution {
    public static void spaceOptimisation(int n){
        if(n<=1){
            System.out.println(n);
            return;
        }
        int prev1=1; // check properly while assigning values to prev1 nd prev2
        int prev2=0;  // prev1=0 && prev2=1 will not work out
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=prev1 + prev2;
            prev2=prev1; // order is important
            prev1=curr;
        } 
        System.out.println(prev1);
    }
         


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        spaceOptimisation(n);
        
    }
}
