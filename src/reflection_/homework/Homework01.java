package reflection_.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ��˳ƽ
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**
         * ����PrivateTest�࣬��˽��name���ԣ���������ֵΪhellokitty
         * �ṩgetName�Ĺ��з���
         * ����PrivateTest���࣬����Class��õ�˽�е�name���ԣ��޸�˽�е�name����ֵ��������getName()�ķ�����ӡname����ֵ
         */
        //1. �õ� PrivateTest���Ӧ��Class����
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. ��������ʵ��
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. �õ�name���Զ���
        Field name = privateTestClass.getDeclaredField("name");//name������private
        //4. ����name
        name.setAccessible(true);
        name.set(privateTestObj, "�����˲�");
        //5. �õ�getName��������
        Method getName = privateTestClass.getMethod("getName");
        //6. ��ΪgetName() ��public������ֱ�ӵ���
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name����ֵ=" + invoke);//�����˲�

    }
}

class PrivateTest {
    private String name = "hellokitty";
    //Ĭ���޲ι�����
    public String getName() {
        return name;
    }
}

