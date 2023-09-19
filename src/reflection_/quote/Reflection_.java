/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 15:51
 */


package reflection_.quote;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        System.out.println("classfullpath=" + className);
        System.out.println("method=" + methodName);

        //2.  �������
        //new className();
        Class<?> aClass = Class.forName(className);   //(1) ������, ����Class���͵Ķ���cls
        Object o = aClass.newInstance();  //����ʵ��
        System.out.println("o����������=" + o.getClass()); //��������
        Method method = aClass.getMethod(methodName); //(2) ��ȡ����
        method.invoke(o); //(3) ���÷���

        Field age = aClass.getField("age"); //(4) ��ȡ����
        age.getName();
        System.out.println("age=" + age.getName());
        age.get(o);//(5) ��������
        System.out.println("age=" + age.get(o));

        Constructor<?> constructor = aClass.getConstructor();  //(6) ��ȡ���췽��  ��������Ϊ��
        System.out.println("constructor=" + constructor);

        Constructor<?> constructor1 = aClass.getConstructor(String.class);  //(7) ��ȡ���췽��  ��������ΪString
        System.out.println("constructor1=" + constructor1);


    }
}
