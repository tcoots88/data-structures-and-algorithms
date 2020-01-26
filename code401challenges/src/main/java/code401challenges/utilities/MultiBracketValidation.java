package code401challenges.utilities;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class MultiBracketValidation {

    public static Stack<Character> stack;



    public static boolean multiBracketValidation(String input){
        if(input.length() == 1)
            return false;

        HashSet<Character> openingBrackets = new HashSet<>();
        openingBrackets.add('{');
        openingBrackets.add('[');
        openingBrackets.add('(');

        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(']', '[');
        pairs.put('}', '{');
        pairs.put(')', '(');

        for(int i = 0; i < input.length(); i++) {
            if(openingBrackets.contains(input.charAt(i))){
                stack.push(input.charAt(i));
            } else {
                if(stack.peek() == null || (pairs.containsKey(input.charAt(i)) && !stack.peek().equals(pairs.get(input.charAt(i)))))
                    return false;
                else if (pairs.containsKey(input.charAt(i)) && stack.peek().equals(pairs.get(input.charAt(i))))
                    stack.pop();
            }
        }

        return true;
    }


}
