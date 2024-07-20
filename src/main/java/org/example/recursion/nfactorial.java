package org.example.recursion;

public class nfactorial {
    public static void main(String[] args) {

        // lets have the factorial of the a number this probelm is getting solved with the help of
        // recursion
        System.out.println(factorial(3));
    }
    static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n * factorial(n -1 );
    }
}
