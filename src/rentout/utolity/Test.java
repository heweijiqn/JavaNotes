package rentout.utolity;

public class Test {
    public static void main(String[] args) {

        //����һ�������࣬ʹ����ϣ��Ϳ���ɾ����
        //Ҫ������һ���ַ������������Ϊ3
//        String s = Utility.readString(3);
//        System.out.println("s=" + s);

        //Ҫ������һ���ַ������������Ϊ10, ����û�ֱ�ӻس����͸�һ��Ĭ��ֵ
        //��ʦ��ʾ���ͰѸ÷�������һ��apiʹ�ü���
        //"hspedu"
        System.out.println("�������ַ���:");
        String s2 = Utility.readString(10, "hspedu");
        System.out.println("s2=" + s2);


        //��ʦ����һ������
        //������ʦ��ֱ��ʹ�� ��.����() => ��Ϊ��һ��������staticʱ������һ����̬����
        //ע�⣺��̬��������ֱ��ͨ����������. => ����ϸ����ʦ������˵.

        A.cry();
    }
}

class A {
    public void hi() {

    }
    public static void cry() {

    }
}


