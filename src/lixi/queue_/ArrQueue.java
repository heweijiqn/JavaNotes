/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/3 0:52
 */


package lixi.queue_;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class ArrQueue {
    public static void main(String[] args) {
        //队列获取元素
        Queue<Integer> integers = new LinkedList<>();
        Integer arr[] = {1,2,1,8,1,1,0,4};
        for (int i = 0; i < arr.length; i++) {
            integers.offer(arr[i]);
        }
        System.out.println(lie(integers));

    }

    /**
     * @param queue
     * @return
     */
    public static Queue<Integer> lie(Queue<Integer> queue){
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>() ;
        while (!queue.isEmpty()){
            Integer i = queue.poll();
            if (i % 2 == 0){
                queue1.offer(i);
            }else {
                queue2.offer(i);
            }
        }
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        return queue1;
    }
    
}
