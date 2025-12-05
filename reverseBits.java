class Solution {
    public int reverseBits(int n) {
        List<Integer> bits = new ArrayList<>();

        // 32 bits exact
        for(int i = 0; i < 32; i++){
            // Last bit of n
            bits.add(n & 1);

            // Shifts n by 1 to the right for next iteration
            n = n >>> 1;
        }

        // Reverses the order of the bits
        // Nevermind, not doing reverse because it'll only reverse
        // the list of bits, but it needs to be an int
        //Collections.reverse(bits);

        // Gotta return an int so
        int result = 0;

        for(int bit : bits){
            // Shifts result by 1 to the left to have space for the next bit #
            result <<= 1;

            // Or operator to insert the next bit into the 0 position
            result |= bit;
        }

        return result;
    }
}
