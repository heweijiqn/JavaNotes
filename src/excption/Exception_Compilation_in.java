package excption;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception_Compilation_in {
    public static void main(String[] args) {
/***写try-catch
 * 是为了防止编译时异常**/
        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /****运行异常类型
     1) NullPointerException 空指针异常
     2) ArithmeticException 数学运算异常
     3) ArrayIndexOutOfBoundsException 数组下标越界异常
     4) ClassCastException 类型转换异常
     5) NumberFormatException 数字格式不正确异常[**/
}
