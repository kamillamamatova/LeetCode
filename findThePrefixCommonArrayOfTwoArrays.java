class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];

        // Memorizes what's in A and B array while traversing
        // through them
        HashSet<Integer> ASet = new HashSet<>();
        HashSet<Integer> BSet = new HashSet<>();

        // The current # for the current position in C array
        int count = 0;
        for(int i = 0; i < A.length; i++){
            ASet.add(A[i]);
            BSet.add(B[i]);

            // If the A set contains the current B
            if(ASet.contains(B[i])){
                count++;
                // If the B set contains the current A
                // and they're not equal to each other.
                // So count doesn't get incremented for
                // the same #
                if(BSet.contains(A[i]) && A[i] != B[i]){
                    count++;
                }
            }   
            // If the B set contains the current A.
            // This is for in case the A set doesn't
            // contain the current B
            else if(BSet.contains(A[i])){
                count++;
                if(ASet.contains(B[i]) && A[i] != B[i]){
                    count++;
                }
            }

            C[i] = count;
        }

        return C;

        /*
        - Given: 2 int permutations A & B of length n
        - Prefix common array of A & B is an array C
            - C[i] is = to the count of #s that are present at
            or before the index i in both A & B
        - Return: prefix common array of A & B
        */
    }
}
