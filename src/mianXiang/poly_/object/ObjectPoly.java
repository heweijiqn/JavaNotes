package mianXiang.poly_.object;

public class ObjectPoly {
    public void  cry() {
        System.out.println("Animal cry() 动物在叫....");
    }
    public static void main(String[] args) {
        //体验对象多态特点
        //animal 编译类型就是 Animal , 运行类型 Dog
        ObjectPoly animal = new SmallDog();
        //因为运行时 , 执行到改行时，animal运行类型是Dog,所以cry就是Dog的cry
        animal.cry(); //小狗汪汪叫

        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new SmallCat();
        animal.cry(); //小猫喵喵叫
    }
}
class SmallCat extends ObjectPoly {

    public void cry() {
        System.out.println("Cat cry() 小猫喵喵叫...");
    }
}
class SmallDog extends ObjectPoly {

    public void cry() {
        System.out.println("Dog cry() 小狗汪汪叫...");
    }
}
