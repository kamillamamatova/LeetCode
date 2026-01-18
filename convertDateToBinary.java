class Solution {
    public String convertDateToBinary(String date) {
        String binaryDate = "";

        // Splits the string into strings when it runs
        // into "-"
        String[] splitDate = date.split("-");

        for(String d : splitDate){
            // Makes the string into an int
            int num = Integer.parseInt(d);
            // Finds the binary representation of the int
            binaryDate += Integer.toString(num, 2) + "-";
        }

        // Since an extra "-" gets added in the for loop at the
        // end, this removes it in the returned string
        return binaryDate.substring(0, binaryDate.length() - 1);

        /*
        - Given: string date (yyyy-mm-dd)
        - Return: biniary representation of date

        So .split("-") and then a for loop and make each
        split string into an int and find the binary
        representation of the number

        Okay nevermind, I can use toBinaryString() function
        so I don't have to manually find the binary
        rep. of each string
        So i'm going to split the string date into separate
        string like I originally planned to, and then in a
        for loop, I'll make each split string into a char
        array and then use toBinaryString() function

        Okay nevermind again, I'm going to combine both of
        these method, split it, convert each split string
        into an int, and then use Integer.toString(int, 2)
        instead to find the base 2 binary rep.
        */
    }
}
