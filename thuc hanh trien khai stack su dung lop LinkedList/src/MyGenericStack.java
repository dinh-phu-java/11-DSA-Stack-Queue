import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        this.stack= new LinkedList();
    }

    public void push(T element){
        this.stack.addFirst(element);
    }

    public boolean isEmpty(){
        if(stack.size() ==0){
            return true;
        }
        return false;
    }
    public int size(){
        return this.stack.size();
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.stack.removeFirst();
    }
}
