class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // Or just num + 2 * t
        int x = num + t + (1 * t);

        return x;
        /*
        - Given: 2 ints, num & t
        - a # x is achievable if it can become equal to num after applying
        an operation at most t times
            - increase or decrease x by 1, & simultaneously increase or 
            decrease num by 1
        - Return: mx possible values of x
        */
    }
}
