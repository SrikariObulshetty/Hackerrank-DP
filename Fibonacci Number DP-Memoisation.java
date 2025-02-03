import java.io.*;
import java.util.*;

public class Solution {
    public static int memoisation(int n, int[] dp){
         if(n<=1){
            dp[n]=n;
             return dp[n];
         }
         if(dp[n]!=-1){ // already computed
              return dp[n];
         }
         dp[n]=memoisation(n-1, dp) + memoisation(n-2, dp);
         return dp[n];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println( memoisation(n,dp));
    }
}
