class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        char[] charArray = s.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            // New char to look ahead, because there's reasons why
            // just doing charArray[i + 1] wouldn't work,
            // specifically out of bounds and next char is empty
            char next;
            if(i + 1 < charArray.length){
                next = charArray[i + 1];
            }
            else{
                next = '\0';
            }

            if(charArray[i] == 'I'){
                if(next == 'V'){
                    sum += 4;
                    i++;
                }
                else if(next == 'X'){
                    sum += 9;
                    i++;
                }
                else{
                    sum += 1;
                }
            }

            else if(charArray[i] == 'V'){
                sum += 5;
            }

            else if(charArray[i] == 'X'){
                if(next == 'L'){
                    sum += 40;
                    i++;
                }
                else if(next == 'C'){
                    sum += 90;
                    i++;
                }
                else{
                    sum += 10;
                }
            }

            else if(charArray[i] == 'L'){
                sum += 50;
            }

            else if(charArray[i] == 'C'){
                if(next == 'D'){
                    sum += 400;
                    i++;
                }
                else if(next == 'M'){
                    sum += 900;
                    i++;
                }
                else{
                    sum += 100;
                }
            }

            else if(charArray[i] == 'D'){
                sum += 500;
            }

            else if(charArray[i] == 'M'){
                sum += 1000;
            }
        }

        return sum;
        
        /* 
        I - 1 
        V - 5 
        X - 10 
        L - 50
        C - 100 
        D - 500 
        M - 1000 
        - Given: roman numeral 
        - Goal: convert to an int 

        I don't remember how to read through a string 
        Maybe make an array and put the string into it, 
        to seperate all the letters 
        Char array, not a string type array
        So all the characters are seperated
        After creating the simple checks, need to check the
        next characters, for special cases like IV, IX, XL, etc.
        */
    }
}
