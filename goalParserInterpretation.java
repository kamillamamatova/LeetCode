class Solution {
    public String interpret(String command) {
        String interpretation = new String();

        char[] commandChar = command.toCharArray();

        for(int i = 0; i < command.length(); i++){
            if(commandChar[i] == 'G'){
                interpretation += 'G';
            }
            else if(commandChar[i] == '(' && commandChar[i + 1] == ')'){
                interpretation += 'o';
                // () is 2 indexes
                i++;
            }
            else{
                interpretation += 'a';
                interpretation += 'l';
                // (al) is 4 indexes
                i += 3;
            }
        }

        return interpretation;

        /*
        - Goal Parser: Interprets a string command
        - Command consists of G, (), and/or (al)
        in some order
        - G - G
        - () - o
        - (al) - al
        */
    }
}
