/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 16:59
 */


package reflection_.class_;

import reflection_.quote.Car;

public class GetObject {
    public static void main(String[] args) throws Exception {
        //1. Class.forName
        String classAllPath = "reflection_.quote.Car"; //ͨ����ȡ�����ļ���ȡ
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);  //class java.lang.Class[reflect.class_.Car]  ������

        //2. ����.class , Ӧ�ó���: ���ڲ�������
        Class cls2 = Car.class;
        System.out.println(cls2);  //class java.lang.Class[reflect.class_.Car]  ������

        //3. ����.getClass(), Ӧ�ó������ж���ʵ��
        Car car = new Car();
        Class cls3 = car.getClass();  //class java.lang.Class[reflect.class_.Car]  ������
        // ���cls�������� java.lang.Class [reflect.class_.Car]
        System.out.println(cls3);


        //4. ͨ�����������4�֡�����ȡ�����Class����
        //(1)�ȵõ�������� car
        Car car1 = new Car();
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)ͨ����������õ�Class����
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1 , cls2 , cls3 , cls4 ��ʵ��ͬһ������
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        System.out.println(car1.equals(car));

        //5. ��������(int, char,boolean,float,double,byte,long,short) �����·�ʽ�õ�Class�����
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        //6. �����������Ͷ�Ӧ�İ�װ�࣬����ͨ�� .TYPE �õ�Class�����
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE; //������װ��BOOLEAN, DOUBLE, LONG,BYTE, SHORT
        System.out.println(type1);

        System.out.println(integerClass.hashCode());//?
        System.out.println(type1.hashCode());//?




    }
}
