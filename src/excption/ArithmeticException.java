package excption;

public class ArithmeticException {
    public static void main(String[] args)  {
        int num1 = 10;
        int num2 = 0;//Scanner();


        //1. num1 / num2 => 10 / 0
        //2. ��ִ�е� num1 / num2 ��Ϊ num2 = 0, ����ͻ����(�׳�)�쳣
        /***ArithmeticException**/
        //3. ���׳��쳣�󣬳�����˳��������� , ����Ĵ���Ͳ���ִ��

        //4. ���쳣������������������
//        int res = num1 / num2;
        //�������Ա����Ϊһ�δ�����ܳ����쳣/���⣬����ʹ��try-catch�쳣������������
        //�Ӷ���֤����Ľ�׳��
        //���ô����->ѡ��->��ݼ� ctrl + alt + t -> ѡ�� try-catch
        //5. ��������쳣������ô��ʹ�������쳣��������Լ���ִ��
        try {
            int res = num1 / num2;
        } catch (java.lang.Exception e) {
            e.printStackTrace(); //�׳��쳣��Ϣ
            System.out.println("�����쳣��ԭ��=" + e.getMessage());//����쳣��Ϣ
        }

        System.out.println("�����������....");

    }
}
