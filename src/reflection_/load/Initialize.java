/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 17:45
 */


package reflection_.load;

public class Initialize {
    public static void main(String[] args) {
        //1. ����B�࣬������ B��class����
        //2. ���� num = 0
        //3. ��ʼ���׶�
        //    �����Զ��ռ����е����о�̬�����ĸ�ֵ�����;�̬������е����,���ϲ�
        /*
                clinit() {
                    System.out.println("B ��̬����鱻ִ��");
                    //num = 300;
                    num = 100;
                }
                �ϲ�: num = 100

         */

        //new B();//�����
        //System.out.println(B.num);//100, ���ֱ��ʹ����ľ�̬���ԣ�Ҳ�ᵼ����ļ���

        //�����������ʱ������ͬ�����ƿ���
        /*
        protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
        {
            //����Ϊ��������ƣ����ܱ�֤ĳ�������ڴ���, ֻ��һ��Class����
            synchronized (getClassLoadingLock(name)) {
            //....
            }
            }
         */


        //��ʼ���׶�
// �����Զ��ռ����е����о�̬�����ĸ�ֵ�����;�̬������е����,���ϲ�
        B b = new B();
    }
}

class B {
    static {
        System.out.println("B ��̬����鱻ִ��");
        num = 300;
    }

    static int num = 100;

    public B() {//������
        System.out.println("B() ��������ִ��");
    }
}

