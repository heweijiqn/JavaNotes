package collecting.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //˵��
        //1. ��ִ��add�����󣬻᷵��һ��booleanֵ
        //2. �����ӳɹ������� true, ���򷵻�false
        //3. ����ͨ�� remove ָ��ɾ���ĸ�����
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T


        set.remove("john");
        System.out.println("set=" + set);//3��

        //
        set  = new HashSet();
        System.out.println("set=" + set);//0
        //4 Hashset ���������ͬ��Ԫ��/����?
        set.add("lucy");//��ӳɹ�
        set.add("lucy");//���벻��
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//Ok
        System.out.println("set=" + set);

        //�ڼ���һ��. �ǳ������������.
        //��Դ�룬�������� �ȸ�С�����һ���ӣ��Ժ���Դ�룬�����Ȼ
        //ȥ������Դ�룬�� add ���׷�����ʲô?=> �ײ����.
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//���벻��.
        System.out.println("set=" + set);


    }
}
class Dog { //������Dog��
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}


