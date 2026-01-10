class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arrayIndices = new ArrayList<>();

        // Index for each word in the string array
        int k = 0;

        for(String word : words){
            char[] wordChar = word.toCharArray();
            // Index for each letter in a word
            int i = 0;
            // Goes through the entire word
            while(i != word.length()){
                if(wordChar[i] == x){
                    // Adds the index of the word in the string array if it
                    // contains character x
                    arrayIndices.add(k);
                    // Breaks out of the loop when x is found,
                    // incanse there's a duplicate
                    break;
                }
                i++;
            }
            k++;
        }

        return arrayIndices;
        /*
        - Given: array of strings words & character x
        - Return: array of indices representing the words that contain the
        character x

        Might have to make a nested loop, like 2 while loops inside of a for
        loop, but that's too much
        */
    }
}
