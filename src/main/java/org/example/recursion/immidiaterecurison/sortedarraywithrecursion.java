package org.example.recursion.immidiaterecurison;

import java.util.Arrays;

public class sortedarraywithrecursion {
    public static void main(String[] args) {

        // so lets have an array
        int arr[] = {2,9,4,5,6,2};
        System.out.println("is Array is Sorted: "+recusionarr(arr,arr.length));
    }

    static boolean recusionarr(int[] arr, int n){
        if (n == 0 || n==1){
            return true;
        }
        // now the calculation part
        if(arr[n-1] >= arr[n-2]){
            return false;
        }
            return recusionarr(arr,n-1);

    }
}
