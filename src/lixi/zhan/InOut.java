/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/10/3 0:38
 */


package lixi.zhan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("all")
public class InOut {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        Integer arr[] = {1,2,1,8,1,1,0,4};

        for (int i = 0; i < arr.length; i++) {
            integers.offer(arr[i]);
        }
        System.out.println(integers);
        reverseQueue(integers);
        System.out.println(integers);




    }

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }

    }






}
