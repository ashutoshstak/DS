package org.example.array.stacks;

public class stacksimp {

    // lets have all the implemntation of stacks here

    // lets initlize the stack

    String[] stackarr;
    int stacklength ;

    int top;
    public stacksimp(int i) {
        stackarr = new String[i];
        stacklength = i;
        top = -1;
    }

    public void push(String s){
        // okay lets push the string inside the stack
       if(checkoverflow() == false) {
           top++;
           stackarr[top] = s;
       }

    }

    public void pop(){
        // check if there is an element in the stack
        if(isEmpty() ==  false){
         System.out.println(stackarr[top]);
         top--;
        }else{
            System.out.println("stack is empty nothing to pop");
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean checkoverflow(){
        if(top >= stacklength){
            System.out.println("Overflow");
            return true;
        }
        return false;
    }
}
