import java.util.*;


public class ArrayStack<T> implements Stack{

    protected int top;
    protected T[] a;



    @Override
    public void push(Object item){
//        if (empty()){
//            throw new Exception("Stack is empty");
//        }
        item = top;

    }

    public T pop() throws Exception{
        if(empty()){
            throw new Exception("Stack is Empty");
        }
        return a[top--];
    }

    @Override
    public Object peek() throws Exception {
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
        if(top==1){
            return true;
        }
        return false;
    }




}
