package leiBasis.overLoad;

public class OverLoad {
    public static void main(String[] ages){
        //������� main ()�����зֱ��ò�����������������ط���
        OverLoad_1 method = new OverLoad_1();
        method.m(10);
        method.m(19,20);
        method.m("�Ұ�ѧϰ");

        System.out.println(method.max(10, 24)); // 24
        System.out.println(method.max(24,10.0 )); // 24.0
        System.out.println(method.max(10.0, 21.4)); // 21.4
        System.out.println(method.max(10.0, 1.4, 30)); // 30.0



        /*
        * ��������ͬ
        * �β��б� ���벻ͬ ���� ���� ˳��
        * �������� ��Ҫ��
        * */

    }




}
