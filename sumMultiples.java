class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 | i % 5 == 0 | i % 7 == 0){
                sum += i;
            }
        }

        return sum;

        /*
        - Given: Positive int n
        - Goal: Find the sum of all ints in the range
        [1, n] inclusive that are divisible by 3, 5, or 7
        - Return: int denoting the sum of all #s in the
        given range satisfying the constraint

        # % 3 == 0 | # % 5 == 0 | # % 7 == 0
        */
    }
}
