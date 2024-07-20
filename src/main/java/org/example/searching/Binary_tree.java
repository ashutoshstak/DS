package org.example.searching;

import java.util.Scanner;

public class Binary_tree {

    private  Node root;


   public void insert(Scanner scanner){

       System.out.println("Enter the root node");
       // now we need to enter the root node
       int value = scanner.nextInt();
       root = new Node(value);
       // now we will call the recusion to make the furthure nodes
       populate(scanner,root);
   }

   void populate(Scanner scanner, Node node){
       // now let us say that the user want to get the value
       // for left and right node
       System.out.println("Do you want to enter the left value");
       boolean left = scanner.nextBoolean();
       if(left) {
           // then get the value from the user for the left and crete a node
           // ad after creating a node add the at node at the left of the root node
           System.out.println("Enter the value");
           int value = scanner.nextInt();
           // we can either do like this
//           Node node1 = new Node(value);
//           root.left = node;
           // or we can directly do like this
           root.left = new Node(value);
           // now again we will call recusiron to add the value or we can say add the
           // child value at the left of the node
           populate(scanner, root.left);
       }
           // now lets add the value on the right side
           System.out.println("Do you want to enter the right value");
           boolean right = scanner.nextBoolean();
           if(right){
               System.out.println("Enter the value");
               int value = scanner.nextInt();
               root.right = new Node(value);
               // the above statement will put the value of the right into the tree
               // now we will again call the recusion in order to add the child node right value
               populate(scanner,root.right);
           }
       }

       // let us create display method to display the tree
    void display(){
       display(this.root,"");
    }

    void display(Node node, String indent){
       if(node == null){
           return;
       }
       System.out.println(indent +node.value);
       // go for printing the left node
        display(root.left, indent+"\\t");
        display(root.right, indent+"\\t");
        // in the above statement we are doing the postorder traversal

    }
   }


      class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

