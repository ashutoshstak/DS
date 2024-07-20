package org.example.recursion;

public class printn_in_recursion {
    public static void main(String[] args) {
        // what we need to do in this problem is we need to print a number n starting from n
        // with the help of recursion

        printn(5);

    }

    static void printn(int n){
        int count = n;
        // firstly we need to write a base case
        if(n == 0){
         return;
        }
        printn(n -1 );
        System.out.print(":"+n);
    }
}
