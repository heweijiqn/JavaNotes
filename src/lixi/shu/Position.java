/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/11/13 15:31
 */


package lixi.shu;

public class Position {
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
        position(bt,0);
    }

    public static void position(BTNode<Character> bt,int i) {
        if (bt == null) {
            return;
        }
        System.out.println(bt.data+" "+i);
        position(bt.lchild,i+1);
        position(bt.rchild,i+1);
    }
}
