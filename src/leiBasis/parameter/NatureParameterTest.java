package leiBasis.parameter;

public class NatureParameterTest {
    public static void main(String [] ages){
        //测试
        NatureParameter i = new NatureParameter();
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        i.test(p);
        //测试题, 如果 test 执行的是 p = null ,下面的结果是 10
        //测试题, 如果 test 执行的是 p = new Person();..., 下面输出的是 10
        System.out.println("main 的 p.age=" + p.age);//100

    }

}
