package JAVA.Collection.List.Stack.Methodd;

import java.util.Stack;

public class method {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push() method => using push method for insert element into the stack
        stack.push(20);
        stack.push(40);
        stack.push(30);
        stack.push(210);
        stack.push(720);

        // Pop() method => using pop method for removing element to the top
        System.out.println("Pop element is: " + stack.pop());
        System.out.println(stack);
        System.out.println("Checking stack is empty: " + stack.isEmpty());
        System.out.println("Peek element: " + stack.peek());
        System.out.println("Element present at: " + stack.search(40));
    }
}
