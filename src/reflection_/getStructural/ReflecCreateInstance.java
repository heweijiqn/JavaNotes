package reflection_.getStructural;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ��ʾͨ��������ƴ���ʵ��
 */
public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //1. �Ȼ�ȡ��User���Class����
        Class<?> userClass = Class.forName("reflection_.getStructural.User");
        //2. ͨ��public���޲ι���������ʵ��
        Object o = userClass.newInstance();
        System.out.println(o);
        //3. ͨ��public���вι���������ʵ��
        /*
            constructor �������
            public User(String name) {//public���вι�����
                this.name = name;
            }
         */
        //3.1 �ȵõ���Ӧ������
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 ����ʵ����������ʵ��
        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp=" + hsp);
        //4. ͨ����public���вι���������ʵ��
        //4.1 �õ�private�Ĺ���������
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 ����ʵ��
        //���ơ������ƽ⡿ , ʹ�÷�����Է���private������/����/����, ������ǰ������ֽ�ϻ�
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "������");
        System.out.println("user2=" + user2);
    }
}

class User { //User��
    private int age = 10;
    private String name = "��˳ƽ����";

    public User() {//�޲� public
    }

    public User(String name) {//public���вι�����
        this.name = name;
    }

    private User(int age, String name) {//private �вι�����
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
