class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for(String i : operations){
            // .equals for strings
            if(i.equals("--X") || i.equals("X--")){
                X--;
            }
            else{
                X++;
            }
        }

        return X;
        /*
        - Intially, the value of X is 0
        - Given: array of strings operations containing a list of operations
        - Return: final value of X after performing all the operations
        */
    }
}
