package lixi.queue_;

@SuppressWarnings("all")
public interface CycleQueue<E> {
    /**
     * ���
     * @param e
     */
    void offer(E e);

    /**
     * ����
     * @return
     */
    E poll();

    /**
     * �鿴����Ԫ��
     * @return
     */
    E peek();

    /**
     * �ж϶����Ƿ�Ϊ��
     * @return
     */
    boolean isEmpty();

    /**
     * ��ȡ������Ԫ�صĸ���
     * @return
     */
    int size();


}
