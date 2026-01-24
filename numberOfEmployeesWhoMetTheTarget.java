class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                count++;
            }
        }

        return count;

        /*
        - Each employee i has worked for hours[i] hours
        - The company requires each employee to work for at least 
        target hours
        - Given: int array hours of length n & int target
        - Return: int count of how many employees worked at least target
        amount of hours
        */
    }
}
