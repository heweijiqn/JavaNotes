/**
 * @author 韩顺平
 * @version 1.0
 * @date 2022/8/5 16:24
 */


package reflection_.quote;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Method_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        common();
        reflictions();
        refliction();

    }

    public static void common() {
        System.out.println("普通方法在调用 ");
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();

        }
        long end = System.currentTimeMillis();
        System.out.println("普通方法调用耗时：" + (end - start) + "ms");
    }
    public static void reflictions() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("反射方法在调用 ");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String className = properties.getProperty("className");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);

        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法调用耗时：" + (end - start) + "ms");
    }
    public static void refliction() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("反射方法在调用 ");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String className = properties.getProperty("className");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查

        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);

        }
        long end = System.currentTimeMillis();
        System.out.println("反射爆破方法调用耗时：" + (end - start) + "ms");
    }
}
