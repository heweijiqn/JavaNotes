/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 16:46
 */


package reflection_.class_;

import reflection_.quote.Car;

import java.lang.reflect.Field;
import java.util.Properties;

public class Method {
    public static void main(String[] args) throws Exception {
        //1 . ��ȡ�� Car �� ��Ӧ�� Class ����
        //<?> ��ʾ��ȷ���� Java ����
        String className = "reflection_.quote.Car";
        Class<?> aClass = Class.forName(className);
        System.out.println(aClass);
        System.out.println(aClass.getClass());

        //3. �õ���
        Package aPackage = aClass.getPackage();  //��ȡ�������� reflection_.quote.Car.class.getPackage()
        System.out.println(aPackage);
        System.out.println(aPackage.getName()); //reflection_.quote  ����  ����������ȡ���µ�������

        System.out.println(aClass.getName()); //reflection_.quote.Car  ȫ�޶���

        //5. ͨ��cls��������ʵ��
        Car car = (Car) aClass.newInstance();  //��������ʵ�� new Car()
        System.out.println(car);    //car.toString() ���ض�����ַ�����ʾ
        //6. ͨ�������ȡ���� brand
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(car));//����
        //7. ͨ����������Ը�ֵ
        brand.set(car, "����");
        System.out.println(brand.get(car));//����
        //8 ��ϣ����ҿ��Եõ����е�����(�ֶ�)
        System.out.println("=======���е��ֶ�����====");
        Field[] fields = aClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());//����
        }


    }

}
