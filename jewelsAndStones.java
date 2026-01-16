class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Counter for stones that are jewels
        int count = 0;

        char[] jewelsChar = jewels.toCharArray();
        HashSet<Character> jewelsSet = new HashSet<>();
        for(char c : jewelsChar){
            jewelsSet.add(c);
        }

        for(int i = 0; i < stones.length(); i++){
            if(jewelsSet.contains(stones.charAt(i))){
                count++;
            }
        }

        return count;

        /*
        - Given: strings jewels & stones
            - Each char in stones is a type of stone
        - Goal: Find how many stones there are that are also jewels
        - Letters are case sensitive

        A hashset would be good for this. I would add everything
        in jewels into a hashset and then check if a letter in
        stones is in jewels, and then make a global count variable,
        that gets incremented if an index in stones contains a
        jewel.
        */
    }
}
