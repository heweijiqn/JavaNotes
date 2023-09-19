package leiBasis.chengYuan;

public class ChengYuan {
    //1. public 表示方法是公开
    //2. void ： 表示方法没有返回值
    //3. speak() : speak 是方法名， () 形参列表
    //4. {} 方法体，可以写我们要执行的代码
    public void speak() {
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int res = 0;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal01 方法 计算结果=" + res);
    }
    //添加 cal02 成员方法,该方法可以接收一个数 n，计算从 1+..+
    //1. (int n) 形参列表， 表示当前有一个形参 n, 可以接收用户输入
    public void cal02(int n) {
        //循环完成
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02 方法 计算结果=" + res);
    }
    //添加 getSum 成员方法,可以计算num1+num2的值
    //1. public 表示方法是公开的
    //2. int :表示方法执行后，返回一个 int 值
    //3. getSum 方法名
    //4. (int num1, int num2) 形参列表，2 个形参，可以接收用户传入的两个数
    //5. return res; 表示把 res 的值， 返回
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

}
