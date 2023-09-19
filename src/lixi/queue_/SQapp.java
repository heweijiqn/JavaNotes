/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/10/3 2:19
 */


package lixi.queue_;

@SuppressWarnings("all")
public class SQapp<E> extends StackQueue {
    public static void main(String[] args) {
        SQapp<Integer> integerQue = new SQapp<>();
        int arr[] = {1,2,1,8,1,1,0,4};
        for (int i = 0; i < arr.length; i++) {
            integerQue.push(arr[i]);
        }
        System.out.println(integerQue.pop());
        System.out.println(integerQue.peek());
        System.out.println(integerQue.empty());
    }
}
