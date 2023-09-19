package reflection_.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ��˳ƽ
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * ����Class���forName�����õ�File���class ����
         * �ڿ���̨��ӡFile������й�����
         * ͨ��newInstance�ķ�������File���󣬲�����E:\mynew.txt�ļ�
         */
        //1. Class���forName�����õ�File���class ����
        Class<?> fileCls = Class.forName("java.io.File");
        //2. �õ����еĹ�����
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        //�������
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File������=" + declaredConstructor);
        }
        //3. ָ���ĵõ� public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath = "d:\\mynew.txt";
        Object file = declaredConstructor.newInstance(fileAllPath);//����File����  ������E:\mynew.txt�ļ�  ������String���͵Ĳ���

        //4. �õ�createNewFile �ķ�������
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);//�����ļ������õ��� createNewFile
        //file���������;���File
        System.out.println(file.getClass());
        System.out.println("�����ļ��ɹ�" + fileAllPath);

    }
}
