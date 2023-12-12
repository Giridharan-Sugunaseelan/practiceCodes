package Day3;

import java.util.Stack;

class ParanthesisChecker
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code 
        if(x.length() % 2 != 0 || x.charAt(0) == '}' || x.charAt(0) == ']' || x.charAt(0) == ')'){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < x.length(); i++){
            char element = x.charAt(i);
            if(element == '{' || element == '[' || element == '('){
                stack.push(element);
            }
            else if(isBalanced(stack.peek(), element)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean isBalanced(char open, char close){
        if(open == '{' && close == '}'){
            return true;
        }
        else if(open == '(' && close == ')'){
            return true;
        }
        else if(open == '[' && close == ']'){
            return true;
        }
        else{
            return false;
        }
    }
}