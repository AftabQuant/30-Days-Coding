package DynamicProgramming;

public class _1FibonacciNumber {
    public static int fibo(int n, int[] dp) {
        if (n==1 || n==0) return n;
        if(dp[n] != 0) return dp[n];
        int ans = fibo(n-1, dp) + fibo(n-2, dp);
        dp[n] = ans;
        return ans;
    }
    public static int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp);
    }
}
