package org.example.Heap;

import java.util.ArrayList;
import java.util.List;

public class priorityQueue {
    public static void main(String[] args) throws Exception {

        Queue queue =  new Queue();
        // add element in the queue
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.insert(6);
        queue.insert(9);
        queue.insert(344);
        queue.insert(5);
        queue.insert(99);
        queue.insert(22);
        queue.deleteNode();
        queue.deleteNode();
        queue.deleteNode();
        Heap<Integer> heap = new Heap<>();
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);
        heap.insert(6);
        heap.insert(9);
        heap.insert(344);
        heap.insert(5);
        heap.insert(99);
        heap.insert(22);
        heap.remove();
        heap.remove();
        heap.remove();



    }
    static class Queue{

        // lets have a arraylist to construt the priorit queue
        List<Integer> list = new ArrayList<>();
// now let's create the function to insert the node in the priority queue
        void insert(int value){
            // so if the list is empty then this means that the first node that is inserted is the rt node

                list.add(value);

            // otherwise if  the list is not empty then insert at the end of the node
       //     list.add(list.size()-1,value);
            // now after adding the element at the last of the list we need to heapify the tree
            // depending on max or min heap
            heapify(list.size()-1);
            // sending the index where the element is inserted

        }

        private void heapify(int index) {
            // basically we need to check that if the parent node value is greater then the current
            // node value then we need to swap how we will get the prent node value
            // we will get it with index - 1 /2
            if(index == 0){
                // then this is the root node nothing is needed
                return;
            }
            // otherwise if it is not the index value then heapify
            // check the parent node of the index
            int parent = getparent(index);
            // once the parent is there check for the value and swap
            if(list.get(parent)> list.get(index)){
                // then swap
            //    if the root node is greater the current node that is there
                swap(index,parent);
                // after swapping the elelment we need to call the heapify function to the root level
                heapify(parent);
            }
        }

        private void swap(int index, int parent) {
            // now we have to swap the element
            int temp = list.get(index);
            list.set(index,list.get(parent));
            list.set(parent,temp);

        }

        public int getleft(int index){
            // so basically we to simply return the left of the index node
            return index * 2 + 1;
        }

        public int getright(int index){
            // so basically we to simply return the right of the index node
            return index * 2 + 2;
        }

        private int getparent(int index) {
            return (index - 1) / 2;
        }

        // after the insertion we need to have the deletion of the node
        public  void deleteNode() throws Exception {
            // okay so for the removal of the minimum element we don;t required
            // the index because ultimatly the first node is the node that we want to return that is the moto
            if(list.isEmpty()){
                // then simply we will return there is nothing to return
                throw  new Exception("Heap is empty there is nothing to return");
            }

            // but if the heap is not empty then we need to swap the root element with the last element
            // and we need to perform the heapify down heap function
            // so we need to perform setting of the element and we need to perform the swapping of the element
            int temp = list.get(0);
            System.out.println("deleted node: "+temp);
            if(!list.isEmpty())
            {

                list.set(0,list.get(list.size()-1));
                list.set(list.size()-1,temp);
                // after swapping of the element performe the down heapify funtion where the
                // top or the root node needs to checked that is it at the min heap position
                downheap(0);
            }
        }

        private void downheap(int index) {
            int min = index;
            int left = getleft(index);
            int right = getright(index);
            // after getting the left and right check for which once is lesser then the
            // index value ans swap
            if(left < list.size() && list.get(left) <  list.get(min)){
                min = left;
            }

            if(right < list.size() && list.get(right) <  list.get(min)){
                min = right;
            }

            // now swap the value that is at the min and index
            if( min != index){
                swap(min,index);
                downheap(min);
            }

        }


        public Queue() {
        }
    }


}
