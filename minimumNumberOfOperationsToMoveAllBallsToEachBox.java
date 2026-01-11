class Solution {
    public int[] minOperations(String boxes) {
        // Holds the min # of operations needed to move all the balls to
        // the ith box
        int[] ans = new int[boxes.length()];

        // Will be the array that holds the indexes of the box that 
        // holds a ball
        int[] ballIndex = new int[boxes.length()];

        // boxes is made into a char array so it can be looked through
        char[] boxesChar = boxes.toCharArray();
        int j = 0;
        // To find each index where there is a ball, so it can be used in
        // the calculation later
        for(int i = 0; i < boxes.length(); i++){
            if(boxesChar[i] == '1'){
                ballIndex[j] = i;
                j++;
            }
        }

        // 
        for(int k = 0; k < boxes.length(); k++){
            // Resets for each box
            int moves = 0;

            // l < j because ballIndex had to be created using boxes length
            for(int l = 0; l < j; l++){
                // Current position - index where a ball is
                moves += Math.abs(k - ballIndex[l]);
            }
            ans[k] = moves;
        }

        return ans;

        /*
        - Have n boxes
        - Given: binary string boxes of length n
            - boxes[i] is 0 if the ith box is empty
            - 1 if it contains one ball
        - In one operation, can move one ball from a box to an adj box
            - box i is adj to box j if abs(i - j) == 1
            - May be more than 1 ball in a box
        - Return: array answer of size n, where answer[i] is the min # of
        operations needed to move all the balls to the ith box

        0 1 2
        1 1 0

        ballIndex = [0, 1]

        moves = 0
        0 index
        moves += Math.abs(0 - ballIndex[0])
        moves += Math.abs(0 - ballIndex[1])
        ans[i] = moves
        */
    }
}
