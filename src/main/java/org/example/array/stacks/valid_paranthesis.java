package org.example.array.stacks;

import java.util.Stack;

public class valid_paranthesis {
    public static void main(String[] args) {

        System.out.println(isValid("(){}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']' ){
            return false;
        }

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()){
                return false;
            }
            if (stack.peek() == '{' && s.charAt(i) == '}' ){
                stack.pop();
            } else if(stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            }else if ( stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}
