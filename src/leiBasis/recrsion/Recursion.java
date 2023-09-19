package leiBasis.recrsion;

public class Recursion {
    /*递归方法：一个方法体内调用它自身
方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环*/
    public void text(int n) {
        if (n > 2) {
            text(n - 1);
        }
        System.out.println("n=" + n);
    }
    //factorial 阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的 n>=1 的整数");
            return -1;

        }

    }
     /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
        以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
        想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？
        思路分析 逆推
        1. day = 10 时 有 1 个桃子
        2. day = 9 时 有 (day10 + 1) * 2 = 4
        3. day = 8 时 有 (day9 + 1) * 2 = 10
        4. 规律就是 前一天的桃子 = (后一天的桃子 + 1) *2//就是我们的能力
        5. 递归
*/
     public int peach(int day) {
         if (day == 10) {//第 10 天，只有 1 个桃
             return 1;
         } else if (day >= 1 && day <= 9) {
             return (peach(day + 1) + 1) * 2;//规则，自己要想
         } else {
             System.out.println("day 在 1-10");
             return -1;
         }
     }


}
