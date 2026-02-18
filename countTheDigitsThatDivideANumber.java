class Solution {
    public int countDigits(int num) {
        int val = 0;
        int valCount = 0;

        // Finds how many digits are in num since it's an int
        // not an int array
        int length = String.valueOf(Math.abs(num)).length();

        int power = length - 1;

        // To not alter num
        int newNum = num;

        for(int i = 0; i < length; i++){
            int divisor = (int)Math.pow(10, power);
            // Finds the individual #
            val = newNum / divisor;

            // Updates newNum for the next iteration
            newNum -= val * divisor;

            power--;

            // Checks if val divides num
            if(num % val == 0){
                valCount++;
            }
        }

        return valCount;
        /*
        - Given: int num
        - Return: # of digits in num that divide num
        - Int val divides nums if nums % val == 0
        */
    }
}
