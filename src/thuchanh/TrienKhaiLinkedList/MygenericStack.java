package thuchanh.TrienKhaiLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static thuchanh.TrienKhaiStackSDLinkedlist.GenericStackClient.stackOfIStrings;

public class MygenericStack<T> {
    private final LinkedList<T> stack;

    public MygenericStack() {
        stack = new LinkedList();
    }

    public void push(T elemet) {
        stack.addFirst(elemet);

    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public static void stackOfIStrings (){
        MygenericStack<String> stack = new MygenericStack<>();
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");
        System.out.println("1.1 size of stack after push operation: " + stack.size());
        System.out.println(" 1.2 pop element from stack :");
        while (!stack.isEmpty()) {
            System.out.println("% s " + stack.pop());
        }
        System.out.println("\n1.3. size of stack after pop operation : " + stack.size());
    }

    private static void stackOfIntegers() {
        MygenericStack<Integer> stack = new MygenericStack<>();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        System.out.println("2.1 size satck after push operation " + stack.size());
        System.out.println("2.2 pop element from stack : ");
        while (!stack.isEmpty()) {
            System.out.println("%d " + stack.pop());
        }
        System.out.println("\n3.3 size of stack after pop operation " + stack.size());
    }

}

