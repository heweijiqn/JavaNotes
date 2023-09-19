package generic.test;

public class Specify_data_type {
    public static void main(String[] args) {

        //ע�⣬�ر�ǿ���� E��������������ڶ���Person�����ʱ��ָ��,���ڱ����ڼ䣬��ȷ��E��ʲô����
        Person<String> person = new Person<String>("����");
        person.show(); //String

        /*
            �����������⣬�����Person��
            class Person {
                String s ;//E��ʾ s����������, �����������ڶ���Person�����ʱ��ָ��,���ڱ����ڼ䣬��ȷ��E��ʲô����

                public Person(String s) {//EҲ�����ǲ�������
                    this.s = s;
                }

                public String f() {//��������ʹ��E
                    return s;
                }
            }
         */

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();//Integer

        /*
            class Person {
                Integer s ;//E��ʾ s����������, �����������ڶ���Person�����ʱ��ָ��,���ڱ����ڼ䣬��ȷ��E��ʲô����

                public Person(Integer s) {//EҲ�����ǲ�������
                    this.s = s;
                }

                public Integer f() {//��������ʹ��E
                    return s;
                }
            }
         */
    }
}

//���͵������ǣ�������������ʱͨ��һ����ʶ��ʾ����ĳ�����Ե����ͣ�
// ������ĳ�������ķ���ֵ�����ͣ������ǲ�������

class Person<E> {
    E s ;//E��ʾ s����������, �����������ڶ���Person�����ʱ��ָ��,���ڱ����ڼ䣬��ȷ��E��ʲô����

    public Person(E s) {//EҲ�����ǲ�������
        this.s = s;
    }

    public E f() {//��������ʹ��E
        return s;
    }

    public void show() {
        System.out.println(s.getClass());//��ʾs����������
    }
}




