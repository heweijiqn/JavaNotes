package leiBasis;

public class VarScope {
    public static void main(String[] ages){
       VarScope p1 = new VarScope();
		/*
		属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。
		局部变量，生命周期较短，伴随着它的代码块的执行而创建，
		伴随着代码块的结束而销毁。即在一次方法调用过程中
		 */
        //p1.say();//当执行say方法时，say方法的局部变量比如name,会创建，当say执行完毕后
        //name局部变量就销毁,但是属性(全局变量)仍然可以使用
        //
        VarScope t1 = new VarScope();
        t1.test(); //第1种跨类访问对象属性的方式

        t1.test2(p1);//第2种跨类访问对象属性的方式

    }
    //全局变量：也就是属性，作用域为整个类体 Cat类：cry eat 等方法使用属性
    //属性在定义时，可以直接赋值
    int age = 10; //指定的值是 10

    //全局变量(属性)可以不赋值，直接使用，因为有默认值，
    double weight;  //默认值是0.0

    public void h() {
        //局部变量必须赋值后，才能使用，因为没有默认值
        int num = 1;
        String address = "北京的猫";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);//属性
    }

    public void cry() {
        //1. 局部变量一般是指在成员方法中定义的变量
        //2. n 和  name 就是局部变量
        //3. n 和 name的作用域在 cry方法中
        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用属性 age=" + age);
    }

    public void eat() {

        System.out.println("在eat中使用属性 age=" + age);


        //System.out.println("在eat中使用 cry的变量 name=" + name);//错误
    }
    //全局变量/属性：可以被本类使用，或其他类使用（通过对象调用)
    public void test() {
        VarScope p1 = new VarScope();
        System.out.println(p1.name);//jack
    }

    public void test2(VarScope p) {
        System.out.println(p.name);//jack
    }
    //细节: 属性可以加修饰符(public protected private..)
    //      局部变量不能加修饰符
    public int age1 = 20;

    String name = "jack";

    public void say() {
        //细节 属性和局部变量可以重名，访问时遵循就近原则
        String name = "king";
        System.out.println("say() name=" + name);
    }

    public void hi() {
        String address = "北京";
        //String address = "上海";//错误,重复定义变量
        String name = "hsp";//可以
    }
}
