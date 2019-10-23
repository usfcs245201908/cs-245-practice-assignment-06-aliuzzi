public class ArrayQueue<T> implements Queue {
    private T[] arr;
    private int tail;
    private int head;
    private int size;
    private int capacity;


    public ArrayQueue(){
        this(500);
    }
    public ArrayQueue(int length) {
        this.capacity = length;
        this.head = 0;
        this.size = 0;
        this.tail = capacity - 1;
        this.arr = (T[]) new Object[length];
    }

    private boolean full(){
        return size == capacity;
    }

    public T dequeue() throws Exception{
        if(empty()){
            throw new Exception();
        }
        T item = arr[head];
        head = (head + 1)%capacity;
        size -= 1;
        return item;
    }

    public void enqueue(Object item) {
        if(full()){
            grow();
        }
        tail = (tail + 1)%capacity;
        arr[tail] = (T) item;
        size += 1;

    }

    public boolean empty() {
        return size == 0;
    }

    private void grow() {
        T[] arr2 = (T[]) new Object[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
        capacity *= 2;
    }
}
