package leiBasis.parameter;

public class VarParameter {
    public static void main(String[] ages){
        VarParameterText i =new VarParameterText();
        System.out.println(i.sum(1, 5, 100)); //106
        System.out.println(i.sum(1,19)); //20

    }
    /*�ɱ������ʱ������Ϊ0������������
    * �ɱ������ʱ������Ϊ���� ���ʾ�������
    * �ɱ���� ���Ժ���ͨ���͵Ĳ���һ������β��б����뱣֤�ɱ�����ں���
    * һ���β��б���ֻ�ܳ���һ���ɱ���� */
}
