/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/29 9:24
 */


package lixi;

public class ShuZhi {
    public static void main(String[] args) {
        //猜数字
        int i = (int) (Math.random() * 100);
        int j = 0;
        while (true) {
            j++;
            if (j == 10) {
                System.out.println("你已经猜了10次了，游戏结束");
                break;
            }
            System.out.println("请输入你猜的数字：");
            int k = new java.util.Scanner(System.in).nextInt();
            if (k > i) {
                System.out.println("你猜的数字大了");
            } else if (k < i) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
