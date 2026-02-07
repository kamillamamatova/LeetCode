class Solution {
    public int subtractProductAndSum(int n) {
        // Starts with 1 because if it's 0,
        // then it'll stay 0 everytime anything
        // else is multiplied to it
        int product = 1;
        int sum = 0;

        // To use in the for loop without messing
        // with n when it's not necessary
        int newN = n;

        // To find length of n
        String nString = Integer.toString(n);
        // Going backwards so I can find the right # that
        // 10 needs to be to the power to
        for(int i = nString.length() - 1; i >= 0; i--){
            int divider = (int)(Math.pow(10, i));
            newN = n / divider;

            // For the next iteration so the first # in n
            // is gone, and replaced with a different one
            n -= newN * divider;

            product *= newN;
            sum += newN;
        }

        return (product - sum);

        /*
        - Given: int number n
        - Return: difference between the 
        product
        */
    }
}
