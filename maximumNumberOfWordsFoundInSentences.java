class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String sentence : sentences){
            // sentence needs to become a String array
            // because in the next for loop
            // it needs to look at each word in the
            // sentence, and it can't do that if it's
            // not an array
            String[] sentenceArray = sentence.split(" ");
            int length = 0;

            for(String s : sentenceArray){
                length++;
            }

            max = Math.max(max, length);
        }

        return max;
        
        /*
        - Given: array of strings sentences
            - sentences[i] represents a single sentence
        - Return: max # of words that appear in a
        single sentence
        */
    }
}
