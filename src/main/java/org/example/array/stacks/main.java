package org.example.array.stacks;

public class main {
    public static void main(String[] args) {


        // lets check if out push statment is runing or not
        stacksimp stack = new stacksimp(4);

        stack.push("This");
        stack.push("is");
        stack.push("an");
        stack.push("Example");

        // lets print the element of the stack via poping out the elment once by one

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
