import java.io.*;
import java.util.*;

public class Solution {
    public static int climbingStairs(int n){
        if(n<0){
            return 0; // didn't reach top
        }
        else if(n==0){
             return 1; // found a way to reach to top
        }
        int oneStep=climbingStairs(n-1);
        int twoSteps=climbingStairs(n-2);
        return oneStep + twoSteps;
         
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(climbingStairs(n));
        
    }
}
