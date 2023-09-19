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

    //使用多态机制，可以统一的管理主人喂食的问题
    //animal 编译类型是Animal,可以指向(接收) Animal子类的对象
    //food 编译类型是Food ,可以指向(接收) Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }
    public static void main(String[] args) {

        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄~");
        Bone bone = new Bone("大棒骨~");
        tom.feed(dog, bone);

        Cat cat = new Cat("小花猫~");
        Fish fish = new Fish("黄花鱼~");
        System.out.println("===========-------");
        tom.feed(cat, fish);


        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("米饭");
        System.out.println("===================");
        tom.feed(pig, rice);
    }

}
