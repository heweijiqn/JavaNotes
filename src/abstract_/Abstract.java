package abstract_;

public class Abstract {
    public static void main(String[] args) {
        //�����࣬���ܱ�ʵ����
        //new A();
    }

}
/**����������
 * */



abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //˼��������eat ������ʵ���ˣ���ʵû��ʲô����
    //���� ���෽����ȷ���Ե�����
    //===> ���ǽ��÷������Ϊ����(abstract)����
    //===> ��ν���󷽷�����û��ʵ�ֵķ���
    //===> ��νû��ʵ�־���ָ��û�з�����
    //===> ��һ�����д��ڳ��󷽷�ʱ����Ҫ����������Ϊabstract��
    //===> һ����˵��������ᱻ�̳У�����������ʵ�ֳ��󷽷�.
//    public void eat() {
//        System.out.println("����һ��������ǲ�֪����ʲô..");
//    }
    public abstract void eat()  ;
}




//�����಻һ��Ҫ����abstract������Ҳ����˵,���������û��abstract����
//����������ʵ�ֵķ���
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}
//һ���������abstract����,��������������Ϊabstract
abstract class B {
    public abstract void hi();
}
//abstract ֻ��������ͷ����������������Ժ�������
class C {
    // public abstract int n1 = 1;
}

//���󷽷�����ʹ��private��final �� static�����Σ���Ϊ��Щ�ؼ��ֶ��Ǻ���д��Υ����
abstract class H {
    public   abstract void hi();//���󷽷�
}

//���һ����̳��˳����࣬��������ʵ�ֳ���������г��󷽷����������Լ�Ҳ����Ϊabstract��
abstract class E {
    public abstract void hi();
}
abstract class F extends E {

}
class G extends E {
    @Override
    public void hi() { //���������G����ʵ���˸���E�ĳ��󷽷�����νʵ�ַ����������з�����

    }
}

//������ı��ʻ����࣬���Կ�������ĸ��ֳ�Ա
abstract class D {
    public int n1 = 10;
    public static  String name = "��˳ƽ����";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {

        System.out.println("ok");
    }
}