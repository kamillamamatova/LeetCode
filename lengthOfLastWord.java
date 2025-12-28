class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int lastLength = 0;

        char[] charArray = s.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            length++;
            // Since length is always = to 1 at the beginning,
            // whether it was reset to 0 or not,
            // it won't be saved to lastLength because ever letter or space
            // will be of length 1 no matter what
            // Saves the last length before it gets reset incase the last
            // few characters are spaces
            if(length != 1){
                lastLength = length;
            }

            // Resets the length if there's a space
            if(charArray[i] == ' '){ 
                length = 0;
            }
        }
        
        // If the last character or previous ones were spaces,
        // then the lastLength that was saved is the length of the
        // last word in the string
        if(length == 0){
            length = lastLength - 1;
        }

        return length;

        /* 
        - Given: string s consisting of words and spaces
        - Return: length of the last word in the string

        What if I seperated the string into characters, and then
        I would have a counter that would reset anytime I would
        run into a space

        Spaces mean a new word is starting, but the string can end
        with a space
        So I made a new int that holds the last length before it got
        reset, and it can't = 1 because the 1 is just the counter after
        it gets reset and it loops again
        lastLength - 1 because the loop starts with length = 1 whether
        it's a space or a letter

        Even if the last word is only 1 letter, it won't need to be saved
        in lastLength since the loop will just end whether there are spaces
        or not at the end
        */
    }
}
