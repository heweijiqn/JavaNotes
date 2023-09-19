/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/11/13 14:48
 */


package lixi.shu;

public class Length {
    //二叉树bt的最小枝长，所谓最小枝长指的是根结点到最近叶子结点的路径长度
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
        bt.lchild.lchild.lchild.lchild = new BTNode<>('p');
        System.out.println(length(bt));
    }
    public static int length(BTNode<Character> bt) {
        if (bt == null) {
            return 0;
        }
        if (bt.lchild == null && bt.rchild == null) {
            return 0;
        }
        int left = length(bt.lchild);
        int right = length(bt.rchild);
        if (left == 0) {
            return right + 1;
        }
        if (right == 0) {
            return left + 1;
        }
        return Math.min(left, right) + 1;
    }

}
