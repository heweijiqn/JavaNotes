package leiBasis.mothods;

import leiBasis.parameter.Person;

public class PersonTest {
    public static void main(String[] ages){
        //���� Person ����
        //p1 �Ƕ�����(��������)
        //new Person() �����Ķ���ռ�(����) ���������Ķ���
        Person p1 = new Person();
        //���������Ĭ��ֵ�������������:
        //int 0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000��boolean false��String null
        System.out.println("\n ��ǰ����˵���Ϣ");
        System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass " + p1.isPass);
        p1.age = 10;
        Person p2 = p1;
        System.out.println("p1��age");
        System.out.println(p1.age);
        System.out.println("p2��age");
        System.out.println(p2.age);

    }
}
