class Solution {
    public int findClosest(int x, int y, int z) {
        // Person 2 is faster
        if(Math.abs(y - z) < Math.abs(x - z)){
            return 2;
        }
        // Person 1 is faster
        else if(Math.abs(y - z) > Math.abs(x - z)){
            return 1;
        }

        // Both are the same speed
        return 0;

        /*
        - Given: 3 ints x, y, & z
            - x is the pos of person 1
            - y is the pos of person 2
            - z is the pos of person 3
        - Person 1 & 2 move toward person 3 at the same speed
        - Return: 1 if person 1 arrives first, 2 if person 2
        arrives first, & 0 if both arrive at the same time

        So just find the abs difference
        */
    }
}
