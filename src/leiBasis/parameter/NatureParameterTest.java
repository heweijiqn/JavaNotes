package leiBasis.parameter;

public class NatureParameterTest {
    public static void main(String [] ages){
        //����
        NatureParameter i = new NatureParameter();
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        i.test(p);
        //������, ��� test ִ�е��� p = null ,����Ľ���� 10
        //������, ��� test ִ�е��� p = new Person();..., ����������� 10
        System.out.println("main �� p.age=" + p.age);//100

    }

}
