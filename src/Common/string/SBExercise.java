package Common.string;

public class SBExercise {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
        sb.append(str);//��Ҫ��Դ�� , �ײ���õ��� AbstractStringBuilder �� appendNull
        System.out.println(sb.length());//4

        System.out.println(sb);//���潫�� ת��Ϊnull�ַ���
        //����Ĺ����������׳�Null pointerException
        StringBuffer sb1 = new StringBuffer(str);//���ײ�Դ�� super(str.length() + 16);
        System.out.println(sb1);

    }
}
