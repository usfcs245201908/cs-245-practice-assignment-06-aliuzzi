import java.util.*;


public class ArrayStack<T> implements Stack<T>{

    protected int top;
    T[] a = (T[]) new Object[10];



    @Override
    public void push(T item){
        a[++top]=item;

    }

    public T pop() throws Exception{
        if(empty()){
            throw new Exception("Stack is Empty");
        }
        return a[top--];
    }

    public T peek() throws Exception {
        if (empty()){
            throw new Exception("Stack is empty");
        }
        return a[0];
    }

//    void grow(){
//        T[] new_a;
//        new_a = [a.length*2];
//        Arrays.copyOfRange(0,a.length,a,new[] a);
//        a = new_a;
//    }

    public boolean empty(){
        if(top==-1){
            return true;
        }
        return false;
    }




}
