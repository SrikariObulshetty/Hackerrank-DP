import java.io.*;
import java.util.*;

public class Solution {
    public static void tabulation(int dp[], int n){
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        } 
        System.out.println(dp[n]);
    }
         


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n<=1){
            System.out.println(n);
            return;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        tabulation(dp,n);
        
    }
}
