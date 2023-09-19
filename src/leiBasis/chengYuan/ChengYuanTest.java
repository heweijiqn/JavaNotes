package leiBasis.chengYuan;


public class ChengYuanTest {
   public static void main(String[] ages){
       ChengYuan p1 = new ChengYuan();
       p1.speak(); //调用方法
       p1.cal01(); //调用 cal01 方法
       p1.cal02(5); //调用 cal02 方法，同时给 n = 5
       p1.cal02(10); //调用 c
       int returnRes = p1.getSum(10, 20);
       System.out.println("getSum 方法返回的值=" + returnRes);

   }
   /*
   (1) 形参列表：表示成员方法输入 cal(int n) ， getSum(int num1, int num2)
   (2) 返回数据类型：表示成员方法输出, void 表示没有返回值
   (3) 方法主体：表示为了实现某一功能代码块
   (4) return 语句不是必须的

    */

}
