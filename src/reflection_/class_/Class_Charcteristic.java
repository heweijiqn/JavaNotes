/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 16:42
 */


package reflection_.class_;

public class Class_Charcteristic {
    public static void main(String[] args) throws ClassNotFoundException {
        //����Class��ͼ
        //1. ClassҲ���࣬���Ҳ�̳�Object��
        //Class
        //2. Class�������new�����ģ�����ϵͳ������
        //(1) ��ͳnew����
        /*  ClassLoader��
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        //Cat cat = new Cat();
        //(2) ���䷽ʽ, �ղ���ʦû��debug�� ClassLoader��� loadClass, ԭ���ǣ���û��ע��Cat cat = new Cat();
        /*
            ClassLoader��, ��Ȼ��ͨ�� ClassLoader�����Cat��� Class����
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        Class cls1 = Class.forName("reflection_.quote.Cat");

        //3. ����ĳ�����Class��������ڴ���ֻ��һ�ݣ���Ϊ��ֻ����һ��
        Class cls2 = Class.forName("reflection_.quote.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("reflection_.quote.Dog");
        System.out.println(cls3.hashCode());


    }
}
