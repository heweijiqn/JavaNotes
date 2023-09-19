package collecting.list_;

public class LinkedList_ {
    public static void main(String[] args) {
        //ģ��һ���򵥵�˫������

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("�Ϻ�");

        //����������㣬�γ�˫������
        //jack -> tom -> hsp
        jack.next = tom;
        tom.next = hsp;
        //hsp -> tom -> jack
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;//��first����ָ��jack,����˫�������ͷ���
        Node last = hsp; //��last����ָ��hsp,����˫�������β���


        //��ʾ����ͷ��β���б���
        System.out.println("===��ͷ��β���б���===");
        while (true) {
            if(first == null) {
                break;
            }
            //���first ��Ϣ
            System.out.println(first);
            first = first.next;
        }

        //��ʾ����β��ͷ�ı���
        System.out.println("====��β��ͷ�ı���====");
        while (true) {
            if(last == null) {
                break;
            }
            //���last ��Ϣ
            System.out.println(last);
            last = last.pre;
        }

        //��ʾ�������Ӷ���/���ݣ��Ƕ�ô�ķ���
        //Ҫ������ tom --------- �Ϻ�ֱ�ӣ�����һ������ smith

        //1. �ȴ���һ�� Node ��㣬name ���� smith
        Node smith = new Node("smith");
        //����Ͱ� smith ���뵽˫��������
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;

        //��first �ٴ�ָ��jack
        first = jack;//��first����ָ��jack,����˫�������ͷ���

        System.out.println("===��ͷ��β���б���===");
        while (true) {
            if(first == null) {
                break;
            }
            //���first ��Ϣ
            System.out.println(first);
            first = first.next;
        }

        last = hsp; //��last ����ָ�����һ�����
        //��ʾ����β��ͷ�ı���
        System.out.println("====��β��ͷ�ı���====");
        while (true) {
            if(last == null) {
                break;
            }
            //���last ��Ϣ
            System.out.println(last);
            last = last.pre;
        }


    }
}




//����һ��Node �࣬Node ���� ��ʾ˫�������һ�����
class Node {
    public Object item; //�����������
    public Node next; //ָ���һ�����
    public Node pre; //ָ��ǰһ�����
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}