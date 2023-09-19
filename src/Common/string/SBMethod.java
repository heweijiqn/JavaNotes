package Common.string;

public class SBMethod {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("hello");
        //��
        s.append(',');// "hello,"
        s.append("������");//"hello,������"
        s.append("����").append(100).append(true).append(10.5);//"hello,����������100true10.5"
        System.out.println(s);//"hello,����������100true10.5"


        //ɾ
        /*
         * ɾ������Ϊ>=start && <end �����ַ�
         * ���: ɾ�� 11~14���ַ� [11, 14)
         */
        s.delete(11, 14);
        System.out.println(s);//"hello,����������true10.5"
        //��
        //�Ϻ������ʹ�� ������ �滻 ����9-11���ַ� [9,11)
        s.replace(9, 11, "������");
        System.out.println(s);//"hello,������������true10.5"
        //����ָ�����Ӵ����ַ�����һ�γ��ֵ�����������Ҳ�������-1
        int indexOf = s.indexOf("������");
        System.out.println(indexOf);//6
        //��
        //�Ϻ������������Ϊ9��λ�ò��� "����",ԭ������Ϊ9�������Զ�����
        s.insert(9, "����");
        System.out.println(s);//"hello,����������������true10.5"
        //����
        System.out.println(s.length());//22
        System.out.println(s);

    }
}
