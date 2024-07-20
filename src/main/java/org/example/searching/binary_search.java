package org.example.searching;

public class binary_search {
    public static void main(String[] args) {
        // basically the pre-requist of the binary search is
        // the array must be sorted and this search can not be applied on the
        // un-sorted array then we have to apply linear search only
        // binary search takes O(logn) time complexity

// lets have an array
        int arr[] = {1,2,3,4,5,6,7,7,8};
        System.out.print(binarysearch(arr,4));

    }

    static  int binarysearch(int arr[], int key){
        // let us first try to find out the mid of the arrays
        // so as we have founded out the mid firstly we will go into the loop
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            // firstly we will compare the value of the
            int mid = start + end / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]> key){
                // then te value will lie between left side of the array
                // we will be reducing the end of the array to find  the mid
                end = mid -1 ;
            }else {
                // otherwise the value will lie at right side of the array
                start = mid+1;
            }
        }
        return -1;
    }
}
