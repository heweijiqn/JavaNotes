/**
 * @author 韩顺平
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

        //2.  反射机制
        //new className();
        Class<?> aClass = Class.forName(className);   //(1) 加载类, 返回Class类型的对象cls
        Object o = aClass.newInstance();  //对象实例
        System.out.println("o的运行类型=" + o.getClass()); //运行类型
        Method method = aClass.getMethod(methodName); //(2) 获取方法
        method.invoke(o); //(3) 调用方法

        Field age = aClass.getField("age"); //(4) 获取属性
        age.getName();
        System.out.println("age=" + age.getName());
        age.get(o);//(5) 调用属性
        System.out.println("age=" + age.get(o));

        Constructor<?> constructor = aClass.getConstructor();  //(6) 获取构造方法  参数类型为空
        System.out.println("constructor=" + constructor);

        Constructor<?> constructor1 = aClass.getConstructor(String.class);  //(7) 获取构造方法  参数类型为String
        System.out.println("constructor1=" + constructor1);


    }
}
