package static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

        D.hi();//ok
        //�Ǿ�̬����������ͨ����������
        //D.say();, ������Ҫ�ȴ��������ٵ���
        new D().say();//����
    }
}
class D {

    private int n1 = 100;
    private static  int n2 = 200;

    /**�����
    ������ķ��ʣ��������� ��صķ���Ȩ��.
    public static  String name = "��˳ƽ����";
    ��ͨ����/��ͨ��Ա����/�Ǿ�̬����/�Ǿ�̬��Ա����/ʵ������
    private int num = 10;
     ����.�������
      ˵�����������������ļ��ض����������Լ�ʹû�д�������ʵ��Ҳ���Է���*/


    public void say() {//�Ǿ�̬����,��ͨ����

    }

    public static  void hi() {//��̬����,�෽��
        //�෽���в�����ʹ�úͶ����йصĹؼ��֣�
        //����this��super����ͨ����(��Ա����)���ԡ�
        //System.out.println(this.n1);
    }

    //�෽��(��̬����)�� ֻ�ܷ��� ��̬���� ��̬����
    //�ھ�:��̬����ֻ�ܷ��ʾ�̬��Ա.
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);����ʹ��
        hi();//OK
        //say();//����
    }
    //��ͨ��Ա�������ȿ��Է���  �Ǿ�̬��Ա��Ҳ���Է��ʾ�̬��Ա
    //С��: �Ǿ�̬�������Է��� ��̬��Ա�ͷǾ�̬��Ա
    public void ok() {
        //�Ǿ�̬��Ա
        System.out.println(n1);
        say();
        //��̬��Ա
        System.out.println(n2);
        hello();

    }
}
