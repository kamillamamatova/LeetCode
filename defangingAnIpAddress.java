class Solution {
    public String defangIPaddr(String address) {
        // Will store the new string
        String newAddress = new String();

        // Index for the newAddress string,
        // since [.] is 3 characters and . is 1
        int j = 0;
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                newAddress += "[.]";
                // Incremementing j by 2 since the length of [] is 2
                j += 2;
            }
            else{
                // If it's not '.' then just add it
                newAddress += address.charAt(i);
            }
            j++;
        }

        return newAddress;

        /*
        - Given: String address
        - Goal: Replace every . with [.]

        THere's a replace function that is more effecient and will make
        this solution 1 line
        */
    }
}
