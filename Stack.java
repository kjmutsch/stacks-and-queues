// Stack class using generics
class MyStack<T> {
    // Internal storage for stack elements
    private T[] elements;
    private int top;
    private int capacity;

    // Constructor
    public MyStack(int capacity) {
    }

    public void push(T element) {
      // TODO
    }

    public T pop() {
      // TODO
    }

    public T peek() {
      // TODO
    }

    public boolean isEmpty() {
      // TODO
    }

    public int size() {
      // TODO
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(10);
    }
}
