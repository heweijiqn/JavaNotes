package decide;

import java.util.Scanner;

public class If1 {
    public static void main(String[] ages){
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎进入购票系统");
        System.out.println("请输入淡旺季情况：\n 1:旺季 \n 2：淡季");
        System.out.println("请输入对应数字");
        int profitability = sc.nextInt();
        System.out.println(profitability);
        if(profitability==1){
            System.out.println("请输入年龄" );
            int age = sc.nextInt();
            if(age>18 && age<65){
                System.out.println("票价为60rmb");
            } else if (age<18&&age>0) {
                System.out.println("票价为30rmb");
            } else if (age>65&&age<150) {
                System.out.println("票价为20rmb");

            }else {
                System.out.println("你输入的年龄有误");
            }

        }else if(profitability==2){
            System.out.println("请输入年龄" );
            int age = sc.nextInt();
            if(age>18&&age<65){
                System.out.println("票价为40rmb");
            } else if ((age>0&&age<18)&&(age>65&&age<150)) {
                System.out.println("票价为20rmb");
            }else {
                System.out.println("你输入的年龄有误");
            }


        }
    }
}
