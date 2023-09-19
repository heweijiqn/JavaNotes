/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/11/13 13:36
 */


package lixi.shu;

public class Count {
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
        System.out.println(count(bt,'l'));
    }

    public static int count(BTNode<Character> bt,char x){
        if (bt==null){
            return 0;
        }
        int count = 0;
        if (bt.data>x){
            count++;
        }
        count+=count(bt.lchild,x);
        count+=count(bt.rchild,x);
        return count;
    }

}
