package org.example.problems;

import java.util.*;
import java.util.Stack;

public class reversePolishAntation {
    // reverse polish annotation basically means that
    // if we have an expression like ((1+3)*5) how we need to resolve this islike we need to replace
    // the operators with the closest closing braces and then we need to read from left to write
    // so for the above expression the output will be 1 3 + 5 *
    // creating a stack of map
    public static void main(String[] args) {


        Stack<HashMap<Character, Integer>> stack = new Stack<>();

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',2);
        map.put('a',5);
        stack.add(map);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }




}
