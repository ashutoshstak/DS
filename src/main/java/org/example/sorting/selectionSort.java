package org.example.sorting;

public class selectionSort {
    public static void main(String[] args) {

        // Basically what selection sort says that - select the first select an element from the array now check for the smallest
        // element in the array at the right part of the array and copare the pointed element with the smallest element
        // now if the pointed element is smaller then swap
        // now the pointer will move ahead lets say from a[0] to a[1] and again same process will get repeated i.e
        // finding the smallest element from right hand side if the current element is the smaller then so nother otherwise swap
        // and more the pointer ahed from a[1] to [2] and repeat the same process

        // lets have an unsorted array
        int[] arr = {3,2,4,21,4};
        selectionSort(arr);
        System.out.println();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }

   static void selectionSort(int[] n){
        // we need a pointer to the first of the elelment and we need to itrate untill the array.length-1

       for(int i=0 ; i<n.length-1; i++){

           int smallest = i+1;
           // now we need a inner loop that will start from i + 1 and check for the smallest elelment in the loop
           for(int j= i+1; j<n.length;j++){
               // now we need to check for the smallest element in the array
               // let us assume that the element that is at the jth position is the smalest and we need to itrate till the end

               if(n[j] < n[smallest]){
                   smallest = j;
               }
           }
           // now till above the smallest element has been founded now we need to replace the same from the pointer element by chcking that if the element is the smallest as well
           if(n[smallest]<n[i]){
               // then we need to swap
               int temp = n[smallest];
               n[smallest] = n[i];
               n[i] = temp;
           }
       }

       // now just return the array

       for(int i: n){
           System.out.print(i+" ,");
       }

   }
}
