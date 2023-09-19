package reflection_.getStructural;

import java.lang.reflect.Field;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ��ʾ�����������
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        //1. �õ�Student���Ӧ�� Class����
        Class<?> stuClass = Class.forName("reflection_.getStructural.Student");
        //2. ��������
        Object o = stuClass.newInstance();//o ���������;���Student
        System.out.println(o.getClass());//Student
        //3. ʹ�÷���õ�age ���Զ���
        Field age = stuClass.getField("age");
        age.set(o, 88);//ͨ����������������
        System.out.println(o);//
        System.out.println(age.get(o));//����age���Ե�ֵ

        //4. ʹ�÷������name ����
        Field name = stuClass.getDeclaredField("name");
        Field name1 = o.getClass().getField("age");
        //��name ���б���, ���Բ���private ����
        name.setAccessible(true);
        //name.set(o, "�Ϻ�");
        name.set(null, "�Ϻ�~");//��Ϊname��static���ԣ���� o Ҳ����д��null
        System.out.println(o);
        System.out.println(name.get(o)); //��ȡ����ֵ
        System.out.println(name.get(null));//��ȡ����ֵ, Ҫ��name��static

    }
}

class Student {//��
    public int age;
    private static String name;

    public Student() {//������
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

