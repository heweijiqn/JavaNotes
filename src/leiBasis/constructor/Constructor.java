package leiBasis.constructor;

public class Constructor {
    public static void main(String[] ages){
        /* �����������η�����Ĭ�ϣ� Ҳ������ public protected private
         ������û�з���ֵ
         ������ �������ֱ���һ��
         �����б� �� ��Ա����һ���Ĺ���
         �������ĵ���, ��ϵͳ���
         ��������������ͬ
         û�з���ֵ
         �ڴ�������ʱ��ϵͳ���Զ��ĵ��ø���Ĺ�������ɶ���ĳ�ʼ��
        */
        ContructorText i1 = new ContructorText();
        System.out.println("i1 ����Ϣ name=" + i1.name + " age=" + i1.age);
        ContructorText i2 = new ContructorText("hwj",20);
        System.out.println("p2 ����Ϣ name=" + i2.name + " age="+ i2.age);

    }
}
