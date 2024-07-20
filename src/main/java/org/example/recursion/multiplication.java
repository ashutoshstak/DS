package org.example.recursion;

public class multiplication {
    public static void main(String[] args) {
        // so in this problem we are basically going to multiply two number m * n but without the
        // multiplication operator just via addition
        // by adding the same number n times
        // lets have a count 0 problem in which if  a number is given i need to check how many zero pesent in this number
        // like if i have 10320 so 2 zero is present in this;

    }
    static int coutZero(int n){
        if(n == 0){
            return 0;
        }
        int smallans = coutZero(n / 10);

        int lastdigit =  n % 10;
        if(lastdigit== 0){
            return smallans +1;
        }
        return smallans;

    }
}
