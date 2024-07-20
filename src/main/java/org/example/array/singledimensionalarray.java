package org.example.array;

public class singledimensionalarray {
    public static void main(String[] args) {

        // declaring an array
        int[] marks;
        // we can initilize the array later on as well
        marks = new int[3];
        // we can also declare array like this
        int[]  newarr = new int[31];

        // we can also initilize the array at the time of declaring it like
        int [] newarrforint = new int[] {
                32,42,31,41,9,84
        };

        for(int i=0 ; i<newarrforint.length; i++){
            System.out.println(i+" For loop");
        }

        // itrating the array with the foreach loop
        for(int i : newarrforint){

            System.out.println(i+" itirating with for each loop");
        }
    }
}
