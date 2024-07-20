package org.example.sorting;

public class bublesort {
    public static void main(String[] args) {

        // buble sort is also an simplest sorting algorithm
        // so basically what buble sort says that just compare adjacent elements
        // and if the adjacent is smaller then simply swap like
        // if we have an array of 5,4,3,1,2 then we will compare 5 with its adjacent 4 and as it is smaller in same mannger
        // we will compare the new array which will be 4,5,3,1,2 now move the pointer and compare 5 with 3 and swap
        // so how many times we need to do the iltration bsaically we need to do the iltration as n-1 times

        int[] arr = {3,2,4,21,4};
        bublesort(arr);
    }

    static void bublesort(int[] arr){
        // so we basically need to make the sorting n-1  times
        for(int i=1; i<arr.length-1; i++){
            // now we need to do the itration and we need to check for the adjacent elements
            for(int j=0; j<arr.length-2;j++){
                // now what we need to check for the adjacent element
                if(arr[i]>arr[i+1]){
                    // then swap
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;

                }
            }
        }
        // print the element
        for(int i: arr){
            System.out.print(i+",");
        }
    }
    // optimized version of the buble sort as if the array is sort then also the sorting will take O(n2)
    // we can optimize the code in such a way that if the array is already sorted we can minimuze the use of inner loop
    // and this will take O(n) time complexity
    // how can we do so we can do so with the help of breaking inner loop and skipping the sorting
    // as the bubble sort working on the priciple of passes i.e the itration happen in the  bubble sort we can test that
    // if the element are already sort we can skip the inner loop
    static void optimizedbublesort(int[] arr){
        // so we basically need to make the sorting n-1  times
        for(int i=1; i<arr.length-1; i++){
            // now we need to do the itration and we need to check for the adjacent elements
            boolean flag = false;
            for(int j=0; j<arr.length-2;j++){
                // now what we need to check for the adjacent element
                if(arr[i]>arr[i+1]){
                    // then swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    // if the skipping happen make the boolean flag as true and do the itration untill it is not needed
                    flag= true;

                }
            }
            if(flag == false){
                break;
            }
        }
        // print the element
        for(int i: arr){
            System.out.print(i+",");
        }
    }

}
