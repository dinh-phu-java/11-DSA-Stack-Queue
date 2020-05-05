import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] myArr=new int[]{1,2,3,4,5};
        Stack<Integer> myStack= new Stack<>();
        for (int i=0;i<myArr.length;i++){
            myStack.push(myArr[i]);
        }
        System.out.println("before reverse arrays");
        System.out.println(Arrays.toString(myArr));

        for (int i=0;i<myArr.length;i++){
            myArr[i]=myStack.pop();
        }
        System.out.println("after reverse arrays");
        System.out.println(Arrays.toString(myArr));
    }
}
