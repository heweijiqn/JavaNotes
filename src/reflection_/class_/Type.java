/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 17:12
 */


package reflection_.class_;

import java.io.Serializable;

public class Type {
    public static void main(String[] args) {

        Class<String> cls1 = String.class;//�ⲿ��
        Class<Serializable> cls2 = Serializable.class;//�ӿ�
        Class<Integer[]> cls3 = Integer[].class;//����
        Class<float[][]> cls4 = float[][].class;//��ά����
        Class<Deprecated> cls5 = Deprecated.class;//ע��
        //ö��
        Class<Enum> cls6 = Enum.class;
        Class<Thread.State> cls10 = Thread.State.class;
        Class<Long> cls7 = long.class;//������������
        Class<Void> cls8 = void.class;//void��������
        Class<Class> cls9 = Class.class;//

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);
        System.out.println(cls9);
        System.out.println(cls10);
    }
}
