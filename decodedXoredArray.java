class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        // Instead of going backwards, I'm just going
        // to switch i + 1 with i - 1 to go from
        // beginning to the end of both the arrays
        for(int i = 1; i < encoded.length + 1; i++){
            // encoded[i - 1] because it needs to
            // look through that array from index 0
            // to the end, and this loop start at
            // index 1 since arr[0] = first
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }

        return arr;

        /*
        - Hidden int array arr that consists of n
        non negative ints
            - Encoded into another int array encoded
            of length n - 1
                - encoded[i] = arr[i] ^ arr[i + 1]
        - Given: encoded array & int first (arr[0])
        - Return: original array arr
        */
    }
}
