package leiBasis.parameter;

public class NatureParameter {
    public void test(Person p) { // 调用对象 可以改变属性值
        p.age = 10000; //修改原对象属性
        //创建一个新的对象与上面的无关
        p = new Person();
        p.name = "tom";
        p.age = 99;

        //p = null;会清空创新创建的值
    }
}
