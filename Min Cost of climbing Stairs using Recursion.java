import java.io.*;
import java.util.*;

public class Solution {
    public static int minCost(int []steps, int idx, int cost, int n){
        if(idx>=n){
            return cost;
        }
        int oneStep=minCost(steps, idx+1, cost , n)  + steps[idx] ;
        int twoSteps=minCost(steps, idx+2, cost , n) + steps[idx] ;
        return Math.min(oneStep, twoSteps);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // no.of steps
        int steps[]=new int[n];
        for(int i=0;i<n;i++){
            steps[i]=scn.nextInt();
        }
        int ans0=minCost(steps, 0, 0, n); // starting from 0th idx
        int ans1=minCost(steps, 1, 0, n); // starting from 1st idx
        System.out.println( Math.min(ans0, ans1));
        
    }
