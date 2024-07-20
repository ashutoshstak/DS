package org.example.stringFormating;

public class twoadjacent {
    public static void main(String[] args) {
        // let there is an count variable
        // where the count is strored for the unique repesentation of string
        String str = "ABCDD";
        System.out.print(countunique(str));

    }
    static int countunique(String str){
        int counter = 0;
        for(int i= 1; i<str.length();i++){
            // now count the unique value and break if the adjacent is found
            char c = str.charAt(i-1);
            // now we can have a back of the previous elment
            if(str.charAt(i) == c){
                break;
            }else {
                counter++;
            }

        }
        return counter+1;
    }
}
