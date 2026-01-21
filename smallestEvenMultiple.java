class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple = n;

        while(multiple % n != 0 || multiple % 2 != 0){
            multiple = n * 2;
        }

        return multiple;

        /*
        - Given: positve int n
        Return: smallest postive int that's multiple
        of 2 & n
        */
    }
}
