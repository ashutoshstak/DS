package org.example.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesort {
    // merge sort is one of the sorting algorithm but it usese recursion
    // and this faster then other two algorithm that we have disscused that is selection sort and bubble sort

    // merge sort basically works on the technique of divide and conqure
    // we basicaly divide the array into two part and divde it until only single element is not left

    public static void main(String[] args) {

        // in merge sort we divide the array from the mid using pointers

        int[] arr = {3,2,4,21,4};
        mergesort(arr,0,arr.length-1);
    }
    static  void mergesort(int[] arr, int start, int end){
        // the base case will be we will stop divideing untill we did not eget single element or 0 zero elelement

        if(start>=end){
            return;
        }
        // now we have write the recirsive case
       // firstly we need to take out the mid of the array
        int mid = start+(end-start)/2;
        int x[] = new int[100];
        int y[] = new int[100];
        for(int i=0; i<=mid;i++){
            x[i] = arr[i];
        }

        for(int i=mid+1; i<=end;i++){
            y[i] = arr[i];
        }
        mergesort(x,start,mid);
        mergesort(y,mid+1,end);
        // so from the above two we will be dicing the array untill unless there is only element after that we need to
        // merger the array by comoaring
      //  mergeArrays(x, y, arr, start,end);
        merge(arr,start,mid,end);
    }

   static void mergeArrays(int x[],int y[],int a[],int s,int e){
        int mid = (s+e)/2;
        int i=s;
        int j = mid+1;
        int k = s;
        while(i<=mid && j<=e){
            if(x[i] < y[j]){
                a[k] = x[i];
                i++;
                k++;
            }else{
                a[k] = y[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            a[k] = x[i];
            k++;
            i++;
        }
        while(j<=e){
            a[k] = y[j];
            k++;
            j++;
        }
    }

    static void merge(int arr[], int left, int mid, int right){
        int n1 = mid - left +1;
        int n2 = right - mid;
        int x[] = new int[n1];
        int y[] = new int[n2];
        // now lets copy the array
        for(int i=0; i<n1;i++){
            x[i] = arr[i+left];
        }
        for(int i=0; i<n2;i++){
            y[i] = arr[mid+1+i];
        }
        // after coping the elelment now we will compare
        int i=0; int j =0 , k = left;
        while(i<n1 && j<n2){
            // we will compare and incemnet the pointer
            if(x[i]<=y[j]){
                // then
                arr[k] = x[i];
                i++;
            }else{
                arr[k] = y[j];
                j++;
            }

            k++;
        }
        // now from the aove statement what will happen is the pointers will move and we have
        // calcualted the array but still some elelment will be misssing
        while(i<n1){
            arr[k] = x[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = y[j];
            j++;
            k++;
        }
        // lets us print the sorted array here only
        for(int l :arr){
            System.out.print(l+",");
        }
    }

}
