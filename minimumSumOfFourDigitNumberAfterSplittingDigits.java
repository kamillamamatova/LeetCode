class Solution {
    public int minimumSum(int num) {
        // To seperate all the #s
        int[] numArr = new int[4];

        // 10 ^ power
        int power = 3;

        // Goes through the array
        for(int i = 0; i < 4; i++){
            // Has to be int
            int divisor = (int)(Math.pow(10, power));

            // Finds the individual #
            numArr[i] = num / divisor;

            // Updates num without the first # in it
            num -= numArr[i] * divisor;

            power--;
        }

        Arrays.sort(numArr);

        // Lower #s in the front * 10 + higher #s
        int new1 = numArr[0] * 10 + numArr[2];
        int new2 = numArr[1] * 10 + numArr[3];

        return new1 + new2;

        /*
        - Given: positive int num (4 digits)
        - Goal: Split num into 2 new ints new1
        & new2 using the dgits found in num
        - Leading 0s are allowed in new1 & new2
        & all the digits in num must be used
        - Return: min possible sum of new1 &
        new2

        The lowest numbers need to be in the front
        So if I sort it, left half and right half
        added to each other
        */
    }
}
