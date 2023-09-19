package mianXiang.poly_.poiy_quote;



public class Master {
    private  String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ʹ�ö�̬���ƣ�����ͳһ�Ĺ�������ιʳ������
    //animal ����������Animal,����ָ��(����) Animal����Ķ���
    //food ����������Food ,����ָ��(����) Food����Ķ���
    public void feed(Animal animal, Food food) {
        System.out.println("���� " + name + " �� " + animal.getName() + " �� " + food.getName());
    }
    public static void main(String[] args) {

        Master tom = new Master("��ķ");
        Dog dog = new Dog("���~");
        Bone bone = new Bone("�����~");
        tom.feed(dog, bone);

        Cat cat = new Cat("С��è~");
        Fish fish = new Fish("�ƻ���~");
        System.out.println("===========-------");
        tom.feed(cat, fish);


        Pig pig = new Pig("С����");
        Rice rice = new Rice("�׷�");
        System.out.println("===================");
        tom.feed(pig, rice);
    }

}
