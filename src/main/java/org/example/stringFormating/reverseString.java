package org.example.stringFormating;

import java.util.Stack;

public class reverseString {

    public static void main(String[] args) {


        // reverse a string if the string is like hello this must be like olleh
        // one way of doing this is via the simply starting a loop from the back of the string and concadinating the
        // the values

        StringBuilder str =  new StringBuilder("hello");
//        String result="";
//        for(int i=str.length(); i>0; i--){
//
//            result += str.charAt(i-1);
//        }
//        System.out.println("The reverse is: "+result);

        // So the above way provide the time complexity of O(N) as it reversly iltrate the string
        // other way to do is like stack so we can simply push all the element into the stack and after that
        // pop out all the element once by one from the stack in the reverse order

        // basically from the above we have created an array now create a method to add the data into the array

        // second approach can be that to take two pointers start and end
        // and swap the element once by one and hence stop once the start pointer cross end or the start is > end
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            // swap the element;
          str =  swap(str,start,end);
            start++;
            end--;
        }

        System.out.println("The new String is: "+str);


    }
    // lets create  a method that swap the charater in the stringbuilder

    static StringBuilder swap(StringBuilder str, int start, int end){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(start, str.charAt(end));
        sb.setCharAt(end, str.charAt(start));
        return sb;
    }


}