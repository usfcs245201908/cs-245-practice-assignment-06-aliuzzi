import java.util.NoSuchElementException;

import java.util.*;

public class ArrayQueue<T> implements Queue {


    int head;
    int tail;
    int size;
    protected T[] a;
    protected T item;

    public T dequeue() {
        if(empty()) throw new NoSuchElementException("Queue Underflow");
            //throw new Exception("Queue is empty");
        //item = head;
        head += 1;
        if (head == size) {
            head = 0;
        }
        empty();
        head = tail;
        return a[head];

    }



    @Override
    public void enqueue(Object item) {
        //a[tail] = item;
        tail++;
        if(tail == size){
            tail = 0;
        }

    }
//
//    public void enqueue(T item) {
//        data[tail] = item;
//        tail+= 1;
//        if (tail == size) {
//            tail = 0;
//        }
//    }
    public boolean empty() {
        return (size == 0);
    }
}
