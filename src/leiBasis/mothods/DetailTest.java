package leiBasis.mothods;

public class DetailTest {
    public static void main(String[] ages){
        Detail a = new Detail();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);

        //细节: 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1, b2);//byte -> int
        //a.getSumAndSub(1.1, 1.8);//double ->int(×)
        //细节: 实参和形参的类型要一致或兼容、个数、顺序必须一致

        //a.getSumAndSub(100);//× 个数不一致
        a.f3("tom", 10); //ok
        //a.f3(100, "jack"); // 实际参数和形式参数顺序不对


    }
    /*? 访问修饰符 (作用是控制 方法使用的范围)
        如果不写默认访问，[有四种: public, protected, 默认, private]
        ? 返回数据类型
        1) 一个方法最多有一个返回值 [思考，如何返回多个结果 返回数组 ]
        2) 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
        3) 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 而且要求返回值类型必须和 return 的
        值类型一致或兼容
        4) 如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ;
        ? 方法名
        遵循驼峰命名法，最好见名知义，表达出该功能的意思即可, 比如 得到两个数的和 getSum, 开发中按照规*/
}
