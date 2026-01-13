class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // First base is 2 and then it increments to n - 2
        int i = 2;

        // Goes through all the possible bases for n
        while(i <= (n - 2)){
            // Finds the length of the binary # calculated for the base,
            // so it can be used to create a bits array.
            // Since int array lengths are fixed
            int lengthN = n; // So it doesn't permanently alter n
            int count = 0;
            while(lengthN != 0){
                lengthN = lengthN / i;
                count++;
            }

            // Places the binary # calculated into an array
            int newN = n;
            // Adds into array backwards,
            // since it calculates the remainders backwards
            int j = count - 1;
            int[] bits = new int[count];
            while(newN != 0){
                bits[j] = newN % i;
                newN = newN / i;
                j--;
            }

            // Walks through the bits array and checks if it's
            // strictly palindromic
            int k = 0;
            while(k < bits.length){
                if(bits[k] != bits[bits.length - k - 1]){
                    return false;
                }
                k++;
            }

            i++;
        }

        return true;

        /*
        - n is palindromic if for ever base b between 2 & n - 2,
        the string representation of the int n in base b
        palindromic
        - Given: int n
        - Return: true if n is strictly palidnromic
            - false otherwise

        To find other bases, % by the base #
        For example,
        9 % 3 = 0
        3 % 3 = 0
        1 % 3 = 1

        0 1 2
        1 0 0

        if bit[i] != bit[bit.length - i - 1]

        Let me try this formula with a larger number like 25
        1255 % 3 = 1
        408 % 3 = 0
        136 % 3 = 1
        45 % 3 = 0
        15 % 3 = 0
        5 % 3 = 2
        2 % 3 = 2

        0 1 2 3 4 5 6
        2 2 0 0 1 0 1
        bit[0] != bit[7 - 0 - 1]
        bit[1] != bit[7 - 1 - 1]
        bit[2] != bit[7 - 2 - 1]
        ...
        */
    }
}
