package mianXiang.poly_.object;

public class ObjectPoly {
    public void  cry() {
        System.out.println("Animal cry() �����ڽ�....");
    }
    public static void main(String[] args) {
        //��������̬�ص�
        //animal �������;��� Animal , �������� Dog
        ObjectPoly animal = new SmallDog();
        //��Ϊ����ʱ , ִ�е�����ʱ��animal����������Dog,����cry����Dog��cry
        animal.cry(); //С��������

        //animal �������� Animal,�������;��� Cat
        animal = new SmallCat();
        animal.cry(); //Сè������
    }
}
class SmallCat extends ObjectPoly {

    public void cry() {
        System.out.println("Cat cry() Сè������...");
    }
}
class SmallDog extends ObjectPoly {

    public void cry() {
        System.out.println("Dog cry() С��������...");
    }
}
