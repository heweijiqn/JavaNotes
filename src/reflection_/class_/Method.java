/**
 * @author 韩顺平
 * @version 1.0
 * @date 2022/8/5 16:46
 */


package reflection_.class_;

import reflection_.quote.Car;

import java.lang.reflect.Field;
import java.util.Properties;

public class Method {
    public static void main(String[] args) throws Exception {
        //1 . 获取到 Car 类 对应的 Class 对象
        //<?> 表示不确定的 Java 类型
        String className = "reflection_.quote.Car";
        Class<?> aClass = Class.forName(className);
        System.out.println(aClass);
        System.out.println(aClass.getClass());

        //3. 得到包
        Package aPackage = aClass.getPackage();  //获取到包对象 reflection_.quote.Car.class.getPackage()
        System.out.println(aPackage);
        System.out.println(aPackage.getName()); //reflection_.quote  包名  可以用来获取包下的所有类

        System.out.println(aClass.getName()); //reflection_.quote.Car  全限定名

        //5. 通过cls创建对象实例
        Car car = (Car) aClass.newInstance();  //创建对象实例 new Car()
        System.out.println(car);    //car.toString() 返回对象的字符串表示
        //6. 通过反射获取属性 brand
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(car));//宝马
        //7. 通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));//奔驰
        //8 我希望大家可以得到所有的属性(字段)
        System.out.println("=======所有的字段属性====");
        Field[] fields = aClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());//名称
        }


    }

}
