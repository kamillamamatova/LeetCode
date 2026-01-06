class Solution {
    public int maxDistinct(String s) {
        int counter = 0;

        char[] sChar = s.toCharArray();

        HashSet<Character> hashset = new HashSet<>();

        for(char i : sChar){
            if(!hashset.contains(i)){
                counter++;
            }

            hashset.add(i);
        }

        return counter;
        /*
        - Given: string s (lowercase)
        - Return: int of max # of substrings where each starts w/ a distinct
        letter

        Going to place every char in s into a hashset and then go in a loop
        and if it doesn't contain it, then add to a counter, which will be
        returned
        */
    }
}
