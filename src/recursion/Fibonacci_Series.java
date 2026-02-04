package recursion;

import java.util.Arrays;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n=9894;//upto 50 terms
        fibonacci_loop(n);
        System.out.println("==============");
        //fibonacci_recursion(n); //very slow
        int[] dp=new int[n+1]; //for memorization
        Arrays.fill(dp,-1);
        System.out.println(fibonacci_recursive_dp(n,dp));
    }
    private static int fibonacci_recursive_dp(int n,int[] dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=fibonacci_recursive_dp(n - 1,dp) + fibonacci_recursive_dp(n - 2,dp);
    }

    private static int fibonacci_recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }

    private static void fibonacci_recursion(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci_recursive(i) + " ");
        }
    }

    private static void fibonacci_loop(int n) {
        int a1=0,a2=1;
        if(n==0||n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(0);
        System.out.println(1);
        for(int i=2;i<n;i++)
        {
            int c=a1+a2;
            System.out.println(c);
            a1=a2;
            a2=c;
        }
    }
}
