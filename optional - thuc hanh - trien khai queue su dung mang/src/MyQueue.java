public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head= 0;
    private int tail=-1;
    private int currentSize=0;

    public MyQueue(int queueSize){
        this.capacity=queueSize;
        this.queueArr=new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status=false;
        if(this.currentSize == this.capacity){
            status=true;;
        }
        return status;
    }

    public boolean iQueueEmpty(){
        boolean status=false;
        if(this.currentSize ==0){
            status=true;
        }
        return status;
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow ! Unable to add element: "+item);
        }else{
            this.tail++;
            if(this.tail== this.capacity-1){
                this.tail=0;
            }
        }
        this.queueArr[this.tail]=item;
        this.currentSize++;
        System.out.println("Element "+item+" is pushed to Queue !");
    }
    public void dequeue(){
        if(isQueueFull()){
            System.out.println("Underflow ! Unalbe to remove element from Queue");
        }else{
            this.head++;
            if(this.head == this.capacity -1){
                System.out.println("Pop operation done ! remove: "+ this.queueArr[this.head -1]);
                this.head=0;
            }else{
                System.out.println("Pop operation done ! removed: "+ this.queueArr[this.head -1]);
            }
            this.currentSize--;
        }
    }

}
