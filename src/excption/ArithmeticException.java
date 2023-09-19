package excption;

public class ArithmeticException {
    public static void main(String[] args)  {
        int num1 = 10;
        int num2 = 0;//Scanner();


        //1. num1 / num2 => 10 / 0
        //2. 当执行到 num1 / num2 因为 num2 = 0, 程序就会出现(抛出)异常
        /***ArithmeticException**/
        //3. 当抛出异常后，程序就退出，崩溃了 , 下面的代码就不在执行

        //4. 用异常处理机制来解决该问题
//        int res = num1 / num2;
        //如果程序员，认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决
        //从而保证程序的健壮性
        //将该代码块->选中->快捷键 ctrl + alt + t -> 选中 try-catch
        //5. 如果进行异常处理，那么即使出现了异常，程序可以继续执行
        try {
            int res = num1 / num2;
        } catch (java.lang.Exception e) {
            e.printStackTrace(); //抛出异常信息
            System.out.println("出现异常的原因=" + e.getMessage());//输出异常信息
        }

        System.out.println("程序继续运行....");

    }
}
