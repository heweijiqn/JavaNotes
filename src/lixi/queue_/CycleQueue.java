package lixi.queue_;

@SuppressWarnings("all")
public interface CycleQueue<E> {
    /**
     * 入队
     * @param e
     */
    void offer(E e);

    /**
     * 出队
     * @return
     */
    E poll();

    /**
     * 查看队首元素
     * @return
     */
    E peek();

    /**
     * 判断队列是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 获取队列中元素的个数
     * @return
     */
    int size();


}
