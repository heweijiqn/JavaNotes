package leiBasis.parameter;

public class VarParameter {
    public static void main(String[] ages){
        VarParameterText i =new VarParameterText();
        System.out.println(i.sum(1, 5, 100)); //106
        System.out.println(i.sum(1,19)); //20

    }
    /*可变参数的时长可以为0个或者任意多个
    * 可变参数的时长可以为数组 本质就是数组
    * 可变参数 可以和普通类型的参数一起放在形参列表但必须保证可变参数在后面
    * 一个形参列表中只能出现一个可变参数 */
}
