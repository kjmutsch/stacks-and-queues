// Stack class using generic array
class MyStack<T> {
    private T[] elements;
    private int top;
    private int capacity;

    // Constructor
    public MyStack(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
    }

    public void push(T element) {
        if (size == capacity) resize();
        elements[++top] = element;
    }

    public T pop() {
        if(isEmpty()) return;
        T elementTemp = elements[top]
        elements[top--] = null
        return elementTemp;
    }

    public T peek() {
        if(isEmpty()) return;
        return elements[top];
    }

    public boolean isEmpty() {
      return top == -1;
    }

    public int size() {
      return top + 1;
    }

    public void print() {
        if(isEmpty()) return;
        for(int i = top; i >= 0; i--) {
            if(i == 0) System.out.println(i);
            else {
                System.out.println(i + ' => ');
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(10);
        //stack.push
    }
}
