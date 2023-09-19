package collecting.list_;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);


        //��ʾһ��ɾ������
        linkedList.remove(); // ����Ĭ��ɾ�����ǵ�һ�����
        //linkedList.remove(2);

        System.out.println("linkedList=" + linkedList);

        //�޸�ĳ��������
        linkedList.set(1, 999);
        System.out.println("linkedList=" + linkedList);

        //�õ�ĳ��������
        //get(1) �ǵõ�˫������ĵڶ�������
        Object o = linkedList.get(1);
        System.out.println(o);//999

        //��ΪLinkedList �� ʵ����List�ӿ�, ������ʽ
        System.out.println("===LinkeList����������====");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);

        }

        System.out.println("===LinkeList������ǿfor====");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("===LinkeList������ͨfor====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


        //Դ���Ķ�.
        /* 1. LinkedList linkedList = new LinkedList();
              public LinkedList() {}
           2. ��ʱ linkeList ������ first = null  last = null
           3. ִ�� ���
               public boolean add(E e) {
                    linkLast(e);
                    return true;
                }
            4.���µĽ�㣬���뵽˫����������
             void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null); ���� l
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }

         */

        /*
          ��Դ�� linkedList.remove(); // ����Ĭ��ɾ�����ǵ�һ�����
          1. ִ�� removeFirst
            public E remove() {
                return removeFirst();
            }
         2. ִ��
            public E removeFirst() {
                final Node<E> f = first;
                if (f == null)
                    throw new NoSuchElementException();
                return unlinkFirst(f);
            }
          3. ִ�� unlinkFirst, �� f ָ���˫������ĵ�һ������õ�
            private E unlinkFirst(Node<E> f) {
                // assert f == first && f != null;
                final E element = f.item;
                final Node<E> next = f.next;
                f.item = null;
                f.next = null; // help GC
                first = next;
                if (next == null)
                    last = null;
                else
                    next.prev = null;
                size--;
                modCount++;
                return element;
            }
         */

    }
}
