package leiBasis.recrsion;

public class Recursion {
    /*�ݹ鷽����һ���������ڵ���������
�����ݹ������һ����ʽ��ѭ���������ظ�ִ��ĳ�δ��룬�������ظ�ִ������ѭ�����ơ�
�ݹ�һ��Ҫ����֪����ݹ飬�������ֵݹ�ͱ��������ݹ飬��������ѭ��*/
    public void text(int n) {
        if (n > 2) {
            text(n - 1);
        }
        System.out.println("n=" + n);
    }
    //factorial �׳�
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("Ҫ������� n>=1 ������");
            return -1;

        }

    }
     /*
        ���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
        �Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ���������� 10 ��ʱ��
        ���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ����⣺��������ٸ����ӣ�
        ˼·���� ����
        1. day = 10 ʱ �� 1 ������
        2. day = 9 ʱ �� (day10 + 1) * 2 = 4
        3. day = 8 ʱ �� (day9 + 1) * 2 = 10
        4. ���ɾ��� ǰһ������� = (��һ������� + 1) *2//�������ǵ�����
        5. �ݹ�
*/
     public int peach(int day) {
         if (day == 10) {//�� 10 �죬ֻ�� 1 ����
             return 1;
         } else if (day >= 1 && day <= 9) {
             return (peach(day + 1) + 1) * 2;//�����Լ�Ҫ��
         } else {
             System.out.println("day �� 1-10");
             return -1;
         }
     }


}
