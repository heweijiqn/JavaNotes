package intreface_.enter.poly;

public class PolyParameter {
    public static void main(String[] args) {
        //�ӿڵĶ�̬����
        //�ӿ����͵ı��� if01 ����ָ�� ʵ����IF�ӿ���Ķ���ʵ��
        IF if01 = new Monster();
        if01 = new Car();

        //�̳����ֵĶ�̬
        //�������͵ı��� a ����ָ�� �̳�AAA������Ķ���ʵ��
        AAA a = new BBB();
        a = new CCC();
    }
}

interface IF {

}
class Monster implements IF{

}
class Car implements  IF{

}

class AAA {

}
class BBB extends AAA {

}
class CCC extends AAA {

}
