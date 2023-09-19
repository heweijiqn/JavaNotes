/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/11/13 14:38
 */


package lixi.shu;

public class Right {
//    �����ҵ���Ĵ������һ�ö�����bt�е�����Ҷ�ӽ�㡣
    public static void main(String[] args) {
        BTNode<Character> bt = new BTNode<>('a');
        bt.lchild = new BTNode<>('b');
        bt.rchild = new BTNode<>('c');
        bt.lchild.lchild = new BTNode<>('d');
        bt.lchild.rchild = new BTNode<>('e');
        bt.rchild.lchild = new BTNode<>('f');
        bt.rchild.rchild = new BTNode<>('g');
        bt.lchild.lchild.lchild = new BTNode<>('h');
        bt.lchild.lchild.rchild = new BTNode<>('i');
        bt.lchild.rchild.lchild = new BTNode<>('j');
        bt.lchild.rchild.rchild = new BTNode<>('k');
        bt.rchild.lchild.lchild = new BTNode<>('l');
        bt.rchild.lchild.rchild = new BTNode<>('m');
        bt.rchild.rchild.lchild = new BTNode<>('n');
        bt.rchild.rchild.rchild = new BTNode<>('o');
        right(bt);
    }

    public static void right(BTNode<Character> bt) {
        if (bt == null) {
            return;
        }
        right(bt.rchild);
        right(bt.lchild);
        if (bt.lchild == null && bt.rchild == null) {
            System.out.println(bt.data);
        }



    }
}
