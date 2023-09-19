package generic.test;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //1.������ָ�����������ǣ�Ҫ�����������ͣ������ǻ�����������
        List<Integer> list = new ArrayList<Integer>(); //OK
        //List<int> list2 = new ArrayList<int>();//����

        //2. ˵��
        //��Ϊ E ָ���� A ����, ������������ new A()
        //�ڸ�����ָ���������ͺ󣬿��Դ�������ͻ�������������
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        //3. ���͵�ʹ����ʽ
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        //��ʵ�ʿ����У�����������д
        //����������������ƶ�, ��ʦ�Ƽ�ʹ������д��
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();

        //4. ���������д ����Ĭ���� Object
        ArrayList arrayList = new ArrayList();//�ȼ� ArrayList<Object> arrayList = new ArrayList<Object>();

        /*
            public boolean add(Object e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        Tiger tiger = new Tiger();
        /*

            class Tiger {//��
                Object e;

                public Tiger() {}

                public Tiger(Object e) {
                    this.e = e;
                }
            }

         */

    }
}
class Tiger<E> {//��
    E e;

    public Tiger() {}

    public Tiger(E e) {
        this.e = e;
    }
}

class A {}
class B extends A {}

class Pig<E> {//
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass()); //��������
    }

}
