package mianXiang.Extends;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//�ڴ�Ĳ���
        //?-> ��ʱ����ע�⣬Ҫ���ղ��ҹ�ϵ��������Ϣ
        //(1) ���ȿ������Ƿ��и�����
        //(2) ���������������ԣ����ҿ��Է��ʣ��򷵻���Ϣ
        //(3) �������û��������ԣ��Ϳ�������û���������(��������и����ԣ����ҿ��Է��ʣ��ͷ�����Ϣ..)
        //(4) �������û�оͰ���(3)�Ĺ��򣬼������ϼ����ֱ࣬��Object...
        System.out.println(son.name);//���ؾ��Ǵ�ͷ����
        //System.out.println(son.age);//���صľ���39
        //System.out.println(son.getAge());//���صľ���39
        System.out.println(son.hobby);//���صľ�������
    }
}

class GrandPa { //ү��
    String name = "��ͷүү";
    String hobby = "����";
}

class Father extends GrandPa {//����
    String name = "��ͷ�ְ�";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father { //����
    String name = "��ͷ����";
}
