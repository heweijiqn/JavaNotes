package leiBasis.parameter;

public class Parameter {
    public void swap(int a,int b){
        System.out.println("\na �� b ����ǰ��ֵ\na=" + a + "\tb=" + b);//a=10 b=20
        //����� a �� b �Ľ���
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na �� b �������ֵ\na=" + a + "\tb=" + b);//a=20 b=10
    }
}
