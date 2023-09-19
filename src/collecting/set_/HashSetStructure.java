package collecting.set_;

import java.util.Objects;

public class HashSetStructure {
    public static void main(String[] args) {
        //ģ��һ��HashSet�ĵײ� (HashMap �ĵײ�ṹ)

        //1. ����һ�����飬����������� Node[]
        //2. ��Щ�ˣ�ֱ�Ӱ� Node[] �����Ϊ ��
        Node[] table = new Node[16];

        //3. �������
        Node john = new Node("john", null);

        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;// ��jack �����ص�john
        Node rose = new Node("Rose", null);
        jack.next = rose;// ��rose �����ص�jack

        Node lucy = new Node("lucy", null);
        table[3] = lucy; // ��lucy �ŵ� table�������Ϊ3��λ��.
        System.out.println("table=" + table[2]+table[3]);


    }
}
class Node { //���, �洢����, ����ָ����һ����㣬�Ӷ��γ�����
    Object item; //�������
    Node next; // ָ����һ�����

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return item.equals(node.item) && next.equals(node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, next);
    }
}



