public class Main {
    public static void main(String[] args) {
        MyLinkListQueue queue=new MyLinkListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue().key);
    }
}
