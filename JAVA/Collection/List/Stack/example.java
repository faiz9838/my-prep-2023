package JAVA.Collection.List.Stack;

import java.util.Stack;

public class example {

    public static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {

            Integer x = (Integer) stack.push(i);
            System.out.println("Pushed value: " + x);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("\nPop operation: \n");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println("Pop value: " + y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer ele = (Integer) stack.peek();
        System.out.println("\nPeek element: " + ele);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Push operation: \n");
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
    }
}
