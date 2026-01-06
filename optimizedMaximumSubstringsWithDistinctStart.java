class Solution {
    public int maxDistinct(String s) {
        int counter = 0;

        int[] freq = new int[26];
        
        char[] sChar = s.toCharArray();

        for(char c : sChar){
            // Increment frequency first
            freq[c - 'a']++;

            // Then check if it only equals 1, and if does, a substring can
            // start with that
            // If it's more than 1, than it has already been used
            if(freq[c - 'a'] == 1){
                counter++;
            }
        }

        return counter;

        /*int counter = 0;

        char[] sChar = s.toCharArray();

        HashSet<Character> hashset = new HashSet<>();

        for(char i : sChar){
            if(!hashset.contains(i)){
                counter++;
            }

            hashset.add(i);
        }

        return counter;*/
        /*
        - Given: string s (lowercase)
        - Return: int of max # of substrings where each starts w/ a distinct
        letter

        Going to place every char in s into a hashset and then go in a loop
        and if it doesn't contain it, then add to a counter, which will be
        returned

        HashSet worked, but it's not effecient, maybe a freq array instead
        */
    }
}
