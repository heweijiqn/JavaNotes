package codeBlock_;

public class CodeBlockDetail {
    public static void main(String[] args) {

        //�౻���ص��������
        //1. ��������ʵ��ʱ(new)
        // AA aa = new AA();
        //2. �����������ʵ��������Ҳ�ᱻ����, ���ң������ȱ����أ�����󱻼���
        // AA aa2 = new AA();
        //3. ʹ����ľ�̬��Աʱ(��̬���ԣ���̬����)
        // System.out.println(Cat.n1);

        //static����飬���������ʱ��ִ�еģ�����ֻ��ִ��һ��.
//        DD dd = new DD();
//        DD dd1 = new DD();

        //��ͨ�Ĵ���飬�ڴ�������ʵ��ʱ���ᱻ��ʽ�ĵ��á�
        // ������һ�Σ��ͻ����һ�Ρ�
        // ���ֻ��ʹ����ľ�̬��Աʱ����ͨ����鲢����ִ��

        System.out.println(DD.n1);//8888, ��̬ģ���һ����ִ��

    }
}
class DD {
    public static int n1 = 8888;//��̬����
    //��̬�����
    static {
        System.out.println("DD �ľ�̬����1��ִ��...");//
    }
    //��ͨ�����, ��new ����ʱ�������ã�������ÿ����һ�����󣬾͵���һ��
    //���������򵥵ģ���� ��ͨ������ǹ������Ĳ���
    {
        System.out.println("DD ����ͨ�����...");
    }
}

class Animal {
    //��̬�����
    static {
        System.out.println("Animal �ľ�̬����1��ִ��...");//
    }
}

class Cat extends Animal {

    public static  int n1 = 999;//��̬����

    //��̬�����
    static {
        System.out.println("Cat �ľ�̬����1��ִ��...");//
    }
}

class BB {
    //��̬�����
    static {
        System.out.println("BB �ľ�̬����1��ִ��...");//1
    }
}

class AA extends BB {


    //��̬�����
    static {
        System.out.println("AA �ľ�̬����1��ִ��...");//2
    }
}
