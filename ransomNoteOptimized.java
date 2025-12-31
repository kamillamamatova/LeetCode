class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for(char c : magazine.toCharArray()){
            // Updates the freq of the letter in the array
            freq[c - 'a']++;
        } 

        for(char c : ransomNote.toCharArray()){
            // If there aren't any more letters like c,
            // then magazine can't construct ransomNote
            if(freq[c - 'a'] <= 0){
                return false;
            }
            // The function will end and return false if a letter isn't
            // in magazine, so this will only decrement when a letter
            // in ransomNote, is also is in magazine, otherwise, it will
            // return false
            // Different from a HashMap which only had keys from magazine
            freq[c - 'a']--;
        }

        return true;

        /*
        I used HashMaps for my first solution because this problem
        was in a HashMap section, but the runtime isn't the best,
        so I'm going to attempt to use freq arrays instead of HashMaps to
        improve the runtime
        
        Since it's letters, and int[] of 26 length will be created,
        and then the ASCII value of the letters will need to be added to
        the int array (- 'a')
        */
    }
}
