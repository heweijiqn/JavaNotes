package leiBasis.constructor;

public class ContructorText {
    /**
     * 在前面定义的 Person 类中添加两个构造器:
     * 第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
     * 第二个带 pName 和 pAge 两个参数的构造器：
     * 使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。
     * 分别使用不同的构造器，创建对象. */
    String name;//默认值 null
    int age;//默认 0
    //第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
    public ContructorText() {
        age = 18;//
    }
    public ContructorText(String pName, int pAge) {

        name = pName;
        age = pAge;
    }
}
