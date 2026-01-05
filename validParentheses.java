class Solution {
    public boolean isValid(String s) {
        char[] sChar = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        // Edge case
        if(sChar.length == 1){
            return false;
        }

        int i = 0;
        while(i < sChar.length){
            // Push if opening parentheses
            if(sChar[i] == '(' || sChar[i] == '[' || sChar[i] == '{'){
                stack.push(sChar[i]);
            }
            else{
                // If the first parentheses isn't an open parentheses
                if(stack.isEmpty()){
                    return false;
                }

                // Peeks at the top element and sees if the closing parentheses
                // matches the opening parentheses
                if(stack.peek() == '('){
                    if(sChar[i] != ')'){
                        return false;
                    }
                    // Pops the top element if it's closing parentheses match
                    // has been found
                    stack.pop();
                }
                else if(stack.peek() == '['){
                    if(sChar[i] != ']'){
                        return false;
                    }
                    stack.pop();
                }
                else if(stack.peek() == '{'){
                    if(sChar[i] != '}'){
                        return false;
                    }
                    stack.pop();
                }
            }
            i++;
        }

        // Instead of return true,
        // return true if the stack is empty, because in the while loop,
        // it won't return false for cases where there are only opening
        // parentheses, and for it to return true, everything in the stack
        // needs to be popped, or string was empty from the beginning
        return stack.isEmpty();

        /* 
        - Given: string s containing just characters (, ), {, }, [, and ]
        - Goal: Determine if input string is valid
            - Valid if open bracket must be closed by the same type of bracket
            in the correct order
            - closed brackets have a corresponding open bracket of the same
            type

        This is a stack type of problem
        Stack is FILO (first in last out)
        
        Instead of doing stack, like push pop
        maybe i can just check if the previous one is the right one
        
        Nevermind, i thought it was supposed to close immediately, but it can
        close whenever, as long as it closes

        Okay so then i need to figure out a stack solution
        Stack makes sense
        example: ([])
        Push (
        push [
        pop [
        pop )

        Until it goes through the entire array or fails one of the conditions

        So pop an opening char when a char closes off an opening char that was
        pushed inpreviously

        This: ([)] wouldn't work bc [ opened after ( so it must be closed first

        So something like stack.push(sChar[0]); before the while loop, then 
        in the while loop push, if sChar[i] == a closing bracket, then peek at
        the top elem in stack, and if it matches (maybe 3 seperate if loops for
        each type of opening parentheses), then pop it, and if not, 
        then return false
        */
    }
}
