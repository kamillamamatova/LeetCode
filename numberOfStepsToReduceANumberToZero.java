class Solution {
    public int numberOfSteps(int num) {
        int stepCount = 0;

        while(num != 0){
            // If num is divisible by 2, 
            // divide it by 2
            if(num % 2 == 0){
                num = num / 2;
            }
            // Otherwise, subtract 1 from num
            else{
                num -= 1;
            }
            stepCount++;
        }

        return stepCount;

        /*
        - Given: int num
        - Return: # of steps to reduce it to 0
        - In 1 step, if the curr # is even, have
        to divide it by 2, otherwise, have to
        subtract 1 from it
        */
    }
}
