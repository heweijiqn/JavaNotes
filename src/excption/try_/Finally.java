package excption.try_;

public class Finally {
    public static void main(String[] args) {
         /*
        ���Խ��� try-finally ���ʹ��, �����÷��൱��û�в����쳣��
        ��˳����ֱ�ӱ���/�˳���Ӧ�ó���������ִ��һ�δ��룬�����Ƿ����쳣��
        ������ִ��ĳ��ҵ���߼�
         */
        try{
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        }finally {
            System.out.println("ִ����finally..");
        }
        System.out.println("�������ִ��..");

    }

}
