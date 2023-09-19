package reflection_.getStructural;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ��ʾͨ��������÷���
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //1. �õ�Boss���Ӧ��Class����
        Class<?> bossCls = Class.forName("reflection_.getStructural.Boss");
        //2. ��������
        Object o = bossCls.newInstance();
        //3. ����public��hi����
        //Method hi = bossCls.getMethod("hi", String.class);//OK
        //3.1 �õ�hi��������
        Method hi = bossCls.getDeclaredMethod("hi", String.class);//OK
        //3.2 ����
        hi.invoke(o, "��˳ƽ����~");

        //4. ����private static ����
        //4.1 �õ� say ��������
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //4.2 ��Ϊsay������private, ������Ҫ���ƣ�ԭ���ǰ�潲�Ĺ�����������һ��
        say.setAccessible(true);
        System.out.println(say.invoke(o, 100, "����", '��'));
        //4.3 ��Ϊsay������static�ģ��������������� �����Դ���null
        System.out.println(say.invoke(null, 200, "����", 'Ů'));

        //5. �ڷ����У���������з���ֵ��ͳһ����Object , �������������ͺͷ�������ķ�������һ��
        Object reVal = say.invoke(null, 300, "����", '��');
        System.out.println("reVal ����������=" + reVal.getClass());//String


        //����ʾһ�����صİ���
        Method m1 = bossCls.getDeclaredMethod("m1");
        Object reVal2 = m1.invoke(o);
        System.out.println("reVal2����������=" + reVal2.getClass());//Monster


    }
}

class Monster {}
class Boss {//��
    public int age;
    private static String name;

    public Boss() {//������
    }

    public Monster m1() {
        return new Monster();
    }

    private static String say(int n, String s, char c) {//��̬����
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//��ͨpublic����
        System.out.println("hi " + s);
    }
}

