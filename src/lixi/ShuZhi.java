/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/9/29 9:24
 */


package lixi;

public class ShuZhi {
    public static void main(String[] args) {
        //������
        int i = (int) (Math.random() * 100);
        int j = 0;
        while (true) {
            j++;
            if (j == 10) {
                System.out.println("���Ѿ�����10���ˣ���Ϸ����");
                break;
            }
            System.out.println("��������µ����֣�");
            int k = new java.util.Scanner(System.in).nextInt();
            if (k > i) {
                System.out.println("��µ����ִ���");
            } else if (k < i) {
                System.out.println("��µ�����С��");
            } else {
                System.out.println("��ϲ�㣬�¶���");
                break;
            }
        }
    }
}
