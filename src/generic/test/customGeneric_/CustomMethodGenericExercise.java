package generic.test.customGeneric_;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //T->String, R->Integer, M->Double
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);//10 �ᱻ�Զ�װ�� Integer10, ���Integer
        apple.fly(new Dog());//Dog

    }
}

class Apple<T, R, M> {//�Զ��巺����

    public <E> void fly(E e) {  //���ͷ���
        System.out.println(e.getClass().getSimpleName());
    }

    //public void eat(U u) {}//������ΪUû������ eat������ʹ������ķ���
    public void run(M m) {
    } //ok
}

class Dog {

}





