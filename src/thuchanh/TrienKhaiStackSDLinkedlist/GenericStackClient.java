package thuchanh.TrienKhaiStackSDLinkedlist;

public class GenericStackClient {
    public static void stackOfIStrings(){
        MyGenericStack <String> stack = new MyGenericStack<String>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.1 size of stack after push operations: " + stack);
        System.out.println("1.2 pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(" %s "+ stack.pop());
        }
        System.out.println("\n1.3. size of stack after pop operations : " + stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack <Integer> stack = new MyGenericStack<Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. size of satck after push operation: " + stack);
        System.out.println("2.2. pop element from stack ");
        while (!stack.isEmpty()){
            System.out.println(" %s " + stack.pop());
        }
        System.out.println("\n.3.3. size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. stack of String ");
        stackOfIStrings();
    }
}
