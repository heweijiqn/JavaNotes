/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/16 21:07
 */


package lixi.resursive;

public class List_ {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l3.next = l2;
        l2.next = l1;
        l5.next = l4;
        l1.next = l5;
        List_ list = new List_();
        System.out.println(list.index(l3, 9));

    }
    int index = -1;
    public  int index(ListNode l,int n){
        index++;
        if (l== null){
            return -1;
        }
        if (l.val == n){
            return index;
        }else {
            int res = index(l.next,n);
            if (res == -1){
                return -1;
            }else {
                return index;
            }
        }

    }


}

@SuppressWarnings("all")
class ListNode {//无头结点
    int val;//节点的size
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

