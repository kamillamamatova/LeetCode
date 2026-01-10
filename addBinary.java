class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Carry bit
        // 0 or 1
        int carry = 0;

        // Builds the answer backwards
        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i >= 0){
                // Adds current bit from a
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        // Needs to be reversed since it was built backwards
        return sb.reverse().toString();

        /* Only works for small inputs

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        int aInt = 0;
        int bInt = 0;


        for(int i = 0; i < a.length(); i++){
            if(aChar[i] == '1'){
                aInt += Math.pow(2, a.length() - 1 - i);
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(bChar[i] == '1'){
                bInt += Math.pow(2, b.length() - 1 - i);
            }
        }

        System.out.println(aInt);
        System.out.println(bInt);
        int sum = aInt + bInt;

        if(sum == 0){
            return "0";
        }

        char[] binaryChar = new char[a.length() + 1];
        int j = a.length();

        while(sum != 0){
            if(sum % 2 == 0){
                binaryChar[j] = '0';
            }
            else{
                binaryChar[j] = '1';
            }
            sum = sum / 2;
            j--;
        }

        System.out.print(binaryChar);

        String binaryString = new String(binaryChar);

        return binaryString;
        */

        /*
        - Given: 2 binary strings a & b
        - Return: their sum as a binary string

        11 = 2^1 + 2^0 = 3
        1 = 2^0 = 1

        3 + 1 = 4

        4 % 2 = 2 R 0
        2 % 2 = 1 R 0
        1 % 2 = 0 R 1

        Need to change string into ints
        Okay, so first need to figure out what # the binary strings represent
        Then add the #s they represent and add them together
        Then find the binary value of the #
        Need to change int into string to return

        Passed case 1, but now there's an issue w/ case 2

        1010 = 2^3 + 2^1 = 8 + 2 = 10
        1011 = 2^3 + 2^1 + 2^0 = 8 + 2 + 1 = 11
        10 + 11 = 21

        That only worked 
        */
    }
}
