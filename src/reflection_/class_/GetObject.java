/**
 * @author 韩顺平
 * @version 1.0
 * @date 2022/8/5 16:59
 */


package reflection_.class_;

import reflection_.quote.Car;

public class GetObject {
    public static void main(String[] args) throws Exception {
        //1. Class.forName
        String classAllPath = "reflection_.quote.Car"; //通过读取配置文件获取
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);  //class java.lang.Class[reflect.class_.Car]  加载类

        //2. 类名.class , 应用场景: 用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);  //class java.lang.Class[reflect.class_.Car]  加载类

        //3. 对象.getClass(), 应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();  //class java.lang.Class[reflect.class_.Car]  加载类
        // 输出cls运行类型 java.lang.Class [reflect.class_.Car]
        System.out.println(cls3);


        //4. 通过类加载器【4种】来获取到类的Class对象
        //(1)先得到类加载器 car
        Car car1 = new Car();
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1 , cls2 , cls3 , cls4 其实是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        System.out.println(car1.equals(car));

        //5. 基本数据(int, char,boolean,float,double,byte,long,short) 按如下方式得到Class类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        //6. 基本数据类型对应的包装类，可以通过 .TYPE 得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE; //其它包装类BOOLEAN, DOUBLE, LONG,BYTE, SHORT
        System.out.println(type1);

        System.out.println(integerClass.hashCode());//?
        System.out.println(type1.hashCode());//?




    }
}
