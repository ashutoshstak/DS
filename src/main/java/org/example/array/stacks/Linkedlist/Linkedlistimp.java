package org.example.array.stacks.Linkedlist;

public class Linkedlistimp {

    // inner class for the node
     class Node {
         String item;
         Node next;

        public  Node(String item){
          this.item = item;
        }
    }

    Node top;
     public Linkedlistimp(){
          this.top = null;
      }

      // creating a push operation
    void push(String item){
         // create a new node
        Node newnode = new Node(item);
        newnode.next = top;
        top = newnode;
    }
    // creating the pop operation
    void pop(){
         // so in order to pop the element
        // we basically need to print the first element ot the element that is
        // at the top of the node and along with this we basically need to change the
        // pointing of the top node to the next
        System.out.println("Popped element is: "+top.item);
        // now change the pointing of the top
        top = top.next;
    }
}
