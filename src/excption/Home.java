package excption;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        /*
        编写应用程序EcmDef.java，接收命令行的两个参数(整数)，计算两数相除。
计算两个数相除，要求使用方法 cal(int n1, int n2)
对数据格式不正确(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException)、除0 进行异常处理(ArithmeticException)。
         */
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        System.out.println("请输入第一个整数:"); //
        inputStr = scanner.next();
        String s = "";
        System.out.println("请输入第二个整数:");
        s = scanner.next();
        String q[]={inputStr,s};



        try {

            //先验证输入的参数的个数是否正确 两个参数
            if(q.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            //先把接收到的参数，转成整数
            double n1 = Integer.parseInt(inputStr);
            double n2 = Integer.parseInt(s);

            double res = cal(n1, n2);//该方法可能抛出ArithmeticException
            System.out.println("计算结果是=" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }


    }
    //编写cal方法，就是两个数的商
    public static double cal(double n1, double n2) {
        return n1 / n2;
    }
}
