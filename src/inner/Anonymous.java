package inner;

public class Anonymous {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}


class Outer04 { //�ⲿ��
    private int n1 = 10;//����
    public void method() {//����
        //���ڽӿڵ������ڲ���
        //�Ϻ����
        //1.���� ��ʹ��IA�ӿ�,����������
        //2.��ͳ��ʽ����дһ���࣬ʵ�ָýӿڣ�����������
        //3.������ Tiger/Dog ��ֻ��ʹ��һ�Σ������ٲ�ʹ��
        //4. ����ʹ�������ڲ������򻯿���
        //5. tiger�ı������� ? IA
        //6. tiger���������� ? ���������ڲ���  Outer04$1
        /***
            ���ǿ��ײ� ����� ���� Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("�ϻ��л�...");
                }
            }
         */
        //7. jdk�ײ��ڴ��������ڲ��� Outer04$1,�������Ͼʹ����� Outer04$1ʵ�������Ұѵ�ַ
        //   ���ظ� tiger
        //8. �����ڲ���ʹ��һ�Σ��Ͳ�����ʹ��
        IA tiger = new IA() { /***���� �����ڲ���**/
            @Override
            public void cry() {
                System.out.println("�ϻ��л�...");
            }
        };
        System.out.println("tiger����������=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();

        //��ʾ������������ڲ���
        //����
        //1. father�������� Father
        //2. father�������� Outer04$2
        //3. �ײ�ᴴ�������ڲ���
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("�����ڲ�����д��test����");
                }
            }
         */
        //4. ͬʱҲֱ�ӷ����� �����ڲ��� Outer04$2�Ķ���
        //5. ע��("jack") �����б�ᴫ�ݸ� ������
        Father father = new Father("jack"){ /**��Ҫ���� **/

            @Override
            public void test() {
                System.out.println("�����ڲ�����д��test����");
            }
        };
        System.out.println("father�������������=" + father.getClass());//Outer04$2
        father.test();

        //���ڳ�����������ڲ���
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("С���Թ�ͷ...");
            }
        };
        animal.eat();
    }
}

interface IA {//�ӿ�
    public void cry();
}
/****
 * ����������ַ�ʽ���Եô��븴��
 */

//class Tiger implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("�ϻ��л�...");
//    }
//}
//class Dog implements  IA{
//    @Override
//    public void cry() {
//        System.out.println("С������...");
//    }
//}

class Father {//��
    public Father(String name) {//������
        System.out.println("���յ�name=" + name);
    }
    public void test() {//����
    }
}

abstract class Animal { //������
    abstract void eat();
}

