package org.example.recursion;

public class sumofdigits {
    public static void main(String[] args) {

       /// so the problem says that if the number n = 12345 then the sum of the digits in the number is 1+2+3+4+5 = 15

        System.out.println("sum is: "+sumdigit(12345));
    }

    static int sumdigit(int n){
        if(n ==0){
            return  0;
        }

        // so how can we reduce the  problem of n
        int sum = sumdigit(n/10); // so lets say that the n = 1234 then it will be 123.4
        int last = n % 10;
        return sum+last;

    }
}
