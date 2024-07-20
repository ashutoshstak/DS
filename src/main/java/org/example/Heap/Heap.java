package org.example.Heap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;

public class Heap< T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap(){
        this.list = new ArrayList<>();
    }

    // so we will be basically needing a swap method that will be basically
    // swapping up the element from once index to other if we are removing the element
    // or inserting a new element to mainting the min head and max heap conditon that
    // top or the root element will have minimum or the maximum element

    private void swap(int first, int second){
        // swapping the elment
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    // get the parant node
    private int getparent(int index){
        // getting the parent of this particular node or with the index
        return (index -1 )/2;
    }
     int left(int index){
        //formula for getting the first node from the parent node
        // formula is index
        return index * 2 +1 ;
    }

    public int right(int index){
        //formula for getting the right node from the parent node
        // formula is index
        return index * 2 + 2 ;
    }

    public void insert(T value){
        // insert the value into the list
        list.add(value);
        // from the abaove statement we have created
        // a value at the end of the heap
        // after that we will heapify the that element to a particular index and swap
        heapify(list.size()-1);
        // we are calling the upheap to get the value on that last index that we have insert just now 
        // at the end of the heap 
        
    }

    private void heapify(int index) {
        // so baically what we need to do is we need to check for the parent
        // of the last inserted index item
        int parent = getparent(index);
        if(index == 0){
            // then just return if the index itself is 0 so it means that we are at the root node
            return;
        }
        // now after checking with the parent we will check if the value is less or more
        if(list.get(index).compareTo(list.get(parent)) < 0 ){
            // then swap the item as we are forming a min heap in which the root node is less then
            // the childrens
            swap(index,parent);
            heapify(parent);
        }
    }

    public T remove() throws  Exception{
        // now in order to remove the element from the heap we simply need to set it as 0
        // and get the last element and swap with the current index
        // and then again call the heapify function
        if(list.isEmpty()){
            throw new Exception("Heap is Empty can not remove the item");
        }
        // now if there is nothing like tha then simply removinf or swap the element with the last element
        // But as it is an min or max heap we will be simply removeing the item that is at the rrot of the tree
        T temp = list.get(0);
        System.out.println("Heap have: "+temp);
        T last = list.get(list.size()-1);
        // now after doing the above opertions if the ist is not empty then just do the downheapify
        if(!list.isEmpty()){
            list.set(0,last);
            // now do the downheap to get the value that is at the  root position to the correct position
            downheap(0);
        }

        return temp;

    }

    private void downheap(int index) {
        // now for the down heap we will check that if the value of left node is greater then the current value
        // then do a down heap
        int min = index;
        int left = left(index);
        int right = right(index);
        // otherwise check if the current value is greater then then the right node value
        int leftnode = left(index);
      //  if(list.get(index).compareTo(list.get(list)) )
            // we will check that if the current node value is greater then the left node then we will

            if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
                min = left;
            }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }
}
