class Solution {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];

        // Sets it up
        arr[0] = pref[0];

        for(int i = 1; i < pref.length; i++){
            // pref[i - 1] instead of arr[i - 1] because
            // pref[i - 1] is the xor result of the
            // previous xor calculations.
            // Since arr[i] is finding what elems
            // up to i can equal pref[i]
            arr[i] = pref[i - 1] ^ pref[i];
        }

        return arr;

        /*
        - Given: int array pref
        - Return: array arr of size pref.length that satisfies
            - pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]

        So to find what blank in this is:
        int ^ blank = another int
        (int ^ blank) ^ int = anotherInt ^ int

        or like
        pref[0] = 5
        pref[0] = arr[0]
        arr[i] = pref[i - 1] ^ pref[i] = 
        */
    }
}
