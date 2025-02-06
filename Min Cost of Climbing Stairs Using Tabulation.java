import java.io.*;
import java.util.*;

public class Solution {
    public static int minCost(int stairs[], int n, int[] dp){
        //tabulation
        // Base Cases
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=Math.min( dp[i-1]+stairs[i-1], dp[i-2]+stairs[i-2]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int stairs[]=new int[n];
        for(int i=0;i<n;i++){
            stairs[i]=scn.nextInt();
        }
        int dp[]=new int[n+1];
        System.out.println( minCost(stairs, n , dp));
    }
}
