package leiBasis.parameter;

public class NatureParameter {
    public void test(Person p) { // ���ö��� ���Ըı�����ֵ
        p.age = 10000; //�޸�ԭ��������
        //����һ���µĶ�����������޹�
        p = new Person();
        p.name = "tom";
        p.age = 99;

        //p = null;����մ��´�����ֵ
    }
}
