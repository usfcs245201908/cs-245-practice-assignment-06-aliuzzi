public class ArrayStack<T> implements Stack {
    private T[] arr;
    private int top;
    private int size;

    public ArrayStack() {
        this(500);
    }

    public ArrayStack(int length) {
        this.arr = (T[]) new Object[length];
        this.top = -1;
        this.size = length;
    }

    public void push(Object item) {
        if (top == size - 1) {
            growArray();
        }
        arr[++top] = (T) item;
    }

    public T pop() throws Exception {
        if (empty()) {
            throw new Exception("Empty Stack");
        }
        return (T) arr[top--];
    }

    public T peek() throws Exception {
        if (empty()) {
            throw new Exception("Empty Stack");
        }
        return arr[top];
    }

    public boolean empty() {
        return top < 0;
    }

    private void growArray() {
        T[] arr2 = (T[]) new Object[size * 2];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
        size *= 2;

    }

}
