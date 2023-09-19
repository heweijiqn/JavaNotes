package mianXiang.overRide;

public class OverRide {
    public static void main(String[] args) {
        /**
         * 方法重写：子类中出现了和父类或接口中一模一样的方法声明。（是在继承和接口中的概念）
         * ?方法重写特点
         * -重写的方法与被重写的方法有同样的返回值类型，方法名，参数列表，和不同的方法体
         * -父类中私有方法不能被重写
         * -子类重写父类方法时，访问权限不能更低（可以一样，或者更高）。private – 默认修饰符 --public（访问权限由低到高）
         * -子类重写父类方法时，建议访问权限一模一样，同时建议添加@Override作为注解，表明这是重写的方法
         * -当子类需要父类的功能，而功能主体子类有自己特有的内容时，可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容
         * */
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student smith = new Student("smith", 20, 123456, 99.8);
        System.out.println(smith.say());
    }

}
