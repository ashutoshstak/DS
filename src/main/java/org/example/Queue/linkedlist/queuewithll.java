package org.example.Queue.linkedlist;

public class queuewithll {
    // queue with linked list implementation
    public class Node {
        Node next;
        String item;

        public Node (String item){
            this.item = item;
            this.next = null;
        }
    }

    // lets create two pointers in order to get track of the last and the end of the queue
    Node front, rear;
    // so what we will be doing is we will be inserting from the back and removing from the front

    // let us implemnet the enqueue that means we need to inset into the queue from rear
    void enqueue(String item){
        Node node = new Node(item);

        // okay so if the queue is empty the node that is being inserted is the first node
        // then this is the node that will be the rear and back
        if(rear == null){
            // this means that the queue is empty and we need to add the first item where both the
            // last or the rear and the front will be pointing to the same item
            this.front = this.rear = node;
        }
        // if this is  not the case this means that we need to insert from the last node
        this.rear.next = node;



    }


}
