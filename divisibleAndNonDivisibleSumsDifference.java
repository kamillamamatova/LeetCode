class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++){
            // If divisible by m
            if(i % m == 0){
                num2 += i;
            }
            // If not divisible by m
            else{
                num1 += i;
            }
        }

        return num1 - num2;
        /*
        - Given: 2 positive ints, n & m
        - num1 is the sum of all ints in the range 1 to n that aren't divisible
        by m
        - num2 is the sum of all ints in the range 1 to n that are divisinle by
        m
        - Return: num1 - num2
        */
    }
}
