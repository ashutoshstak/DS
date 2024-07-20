package org.example.sorting;

public class quicksort {
    public static void main(String[] args) {

    }

    static void quicksort(int[] arr, int start, int end ){

        if(start>=end){
            return;
        }
        // what this partition fuction will do is this will provide
        // the piviot elemet and then after we will apply
        // quick sort on the left aray and on the reight array
        int p = partion(arr,start,end);
        quicksort(arr,start,p-1);
        quicksort(arr,p+1,end);

    }

     static int partion(int arr[], int start, int end) {
        // lets us assume that our pivito elrment is the last elelment
         // and it will return the index p that comes after sorting of the
         // element that less then p at the left had side and larger then p
         // that comes after p and we will returing p
         int pivot = end;
         int counter =0;
         int smallcount =0;
         while(counter <= end){

             // one approach will be like counting the number of elemet that are smaller then pivot
             // and returning smallercount + starting Index
             if(arr[counter]>arr[pivot]){
                 // swap and incrrate smaller count
                 ++smallcount;
                 int temp = arr[pivot];

             }
         }
         return  0;
    }
}
