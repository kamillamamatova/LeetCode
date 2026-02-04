class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> stable = new ArrayList<>();

        for(int i = 1; i < height.length; i++){
            // If the height of the mountain before the heightn of the
            // current mountain is > than the threshold
            if(height[i - 1] > threshold){
                // Add the index of the current height to stable 
                // mountain array.
                // because the index represents which mountain it is
                stable.add(i);
            }
        }

        return stable;

        /*
        - n mountains in a row
            - Each mountain has a height
        - Given: int array height
            - height[i] represents the height of mountain i & int threshold
        - A mountain is stable if the mountain just before it has a height
        greater than threshold
            - mountain 0 isn't stable
        - Return: array containing the indices of all stable mountains in
        any order
        */
    }
}
