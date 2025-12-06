class Solution {
    // DP problem
    // Depends on the smaller versions of the same problem
    public int climbStairs(int n) {
        // If it's 1 or 2, then it's just 1 or 2
        if(n <= 2){
            return n;
        }

        // Steps 1 and 2
        int a = 1;
        int b = 2;

        // f(n) = f(n - 1) + f(n - 2)
        // f(1) = 1
        // f(2) = 2
        // f(3) = f(1) + f(2) = 1 + 2 = 3
        // f(4) = f(2) + f(3) = 2 + 3 = 5
        for(int i = 3; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
