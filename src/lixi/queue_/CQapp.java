/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/3 1:06
 */


package lixi.queue_;


import java.util.Arrays;

@SuppressWarnings("all")
public class CQapp<E> implements CycleQueue<E> {
    private Object[] arr;
    private int size;
    private int front;
    private int rear;
    int tag = 0;
    //初始化队列
    public CQapp(int i) {
        arr = new Object[i];
        size = 0;
        front = 0;
        rear = 0;
        tag = 0;
    }

    public CQapp() {
        arr = new Object[20];
        size = 0;
        front = 0;
        rear = 0;
        tag = 0;
    }

    public CQapp(Object[] arr, int size, int front, int rear, int tag) {
        this.arr = arr;
        this.size = size;
        this.front = front;
        this.rear = rear;
        this.tag = tag;
    }

    @Override
    public void offer(E e) {
        if (tag == 1){
            throw new RuntimeException("队列已满");
        }
        arr[rear] = e;
        rear = (rear + 1) % arr.length;
        size++;
        if (rear == front&&size==arr.length){
            tag = 1;
        }
    }

    @Override
    public E poll() {
        if (tag == 0){
            throw new RuntimeException("队列为空");
        }
        E e = (E) arr[front];
        front = (front + 1) % arr.length;
        size--;
        if (rear == front&&size==0){
            tag = 0;
        }
        return (E) arr[front];
    }
    @Override
    public E peek() {
        if (tag == 0){
            throw new RuntimeException("队列为空");
        }
        return (E) arr[front];
    }


    @Override
    public boolean isEmpty() {
        return tag == 0;
    }
    @Override
    public int size() {
        return size;

    }
    public E get(int j){
        return (E) arr[j];
    }

   public E set(int j,E e){
        arr[j] = e;
        return e;
    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr);

    }

    public static void main(String[] args) {
        Integer[] arrs = new Integer[8];
        CQapp<Integer> integers = new CQapp<>(arrs.length);
        arrs = new Integer[]{1,2,1,8,1,1,0,4};

        for (int i = 0; i < arrs.length; i++) {
            integers.offer(arrs[i]);
        }
        System.out.println(integers);
        System.out.println(integers.peek());
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
        System.out.println(integers.poll());
        System.out.println(integers.get(2));
        System.out.println(integers.set(2,5));
        System.out.println(integers);



    }
}
