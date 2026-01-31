class Solution {
    public int mirrorDistance(int n) {
        int reverseN = 0;
        
        int division = n;

        int size = String.valueOf(n).length();
        // To not alter size, since it'll be
        // used as a bound for the for loop
        int loopSize = size;

        for(int i = 0; i < size - 1; i++){  
            loopSize--;

            int remainder = division % 10;
            division = division / 10;

            reverseN += remainder * Math.pow(10, loopSize);
        }
        
        // Adds the last single digit
        reverseN += division;

        return Math.abs(n - reverseN);

        /*
        - Given: int n
        - Mirror distance: abs(n - reverse(n))
            - reverse(n) is the int formed by
            reversing the digits of n
        - Return: int of the mirror distance

        Math.abs

        To reverse n, I either make int n into
        an int array
        Or, I could do something with modulo
        Ex. n = 25
        idk1 = 25 % 10 = 5
        idk2 = 25 / 10 = 2
        reverseN = 5 * Math.pow(10, idk2 - 1)
        reverseN = 50
        reverseN += 2 * Math.pow(10, idk2 - 2)

        Only works for a int of size 2, not sure
        about something a bigger one

        Ex. n = 256
        idk1 = n;
        idk2 = n;
        reverseN = 0;
        size = String.valueOf(n).length()
            idk1 = idk2
            idk1 = 256 % 10 = 6
            size--;
            size = 2
            idk2 = 256 / Math.pow(10, size) = 25
            reverseN += 6 * Math.pow(10, size)
        
        idk1 = 25
        idk1 = 25 % 10 = 5
        idk2 = 25 / 10 = 2
        size = 1;
        reverseN += 5 * Math.pow(10, size)

        Loop needs to end before the last # is left
        so idk2 can be added to reverseN outside of it
        */
    }
}
