public class MyStack {
    private int[] arr;
    private int size;
    private int index=0;

    public MyStack(int size){
        this.size=size;
        this.arr=new int[size];
    }
   public void push(int element){
        if(isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        this.arr[index]=element;
        index++;
   }
   public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return this.arr[--this.index];
   }
    public int size(){
        return this.index;
    }
    public boolean isEmpty(){
        if(this.index ==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(this.index==size){
            return true;
        }
        return false;
    }
}
