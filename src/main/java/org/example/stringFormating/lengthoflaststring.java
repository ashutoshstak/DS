package org.example.stringFormating;

public class lengthoflaststring {
    public static void main(String[] args) {

        // check if the last word length of the string

        String str = " world";

        // firstly check the length of the string
        // the brut force approch will be like to check the length of the string and iltrating over the  string
        // another approvch can be add a special character into the white space and excule those character from count
        str = str.trim();
        String specialsrtr  = str.replaceAll("\\s","#");
        // now after the replacement with the new character

        // second approach

        // -- second sinple apprach can be like adding just reversing the string and counting till the end of the stirng
        // or the untill we did not find the first special character
        // -- third approach can be like we can even use a stack

        char strarr[] = new char[specialsrtr.length()];

        for(int i=0; i<specialsrtr.length(); i++){
           strarr[i] = specialsrtr.charAt(i);
    //       System.out.println(specialsrtr.charAt(i));
        }
        // so the above code will be able to fetch char as in array
        // after that we need to get it from last to the first special character that we found we can do the same
        // for the whitespaces as well

        for(int i=0; i<specialsrtr.length(); i++){

            System.out.println(strarr[i]);
        }
        int count = 0;
        for(int i= strarr.length-1; i>=0; i--){
            if(specialsrtr.charAt(i) == '#'){
                break;
            }
            ++count;
        }

        System.out.println("The last world length is: "+count);

        // so casically with the above approach it is taking almmost like O(2N) time in order to do the itratiion

        // let us suppose that how we can reduce it to the O(N)
        // in order to do so we have a apprach in where we will be having the itrations going in a sequancial maner and we will be couting out the letters
        // once we in counter the '' whitespace we will be basically making that count as 0 and the last  count that will be counted will be the last
        // words of counting in the string
        System.out.println("-------New Approach with O(N)----------");
        int result = 0;
        for(int i=0; i<str.length()-1 ; i++){
            // now we are itrating to the string now we need a count variable
            if((str.charAt(i) != ' ')){
                ++result;
            }
           result = 0;
        }
        // now we simply needs to give the count
        System.out.println("This is the count result of the string: "+result);
    }
}
