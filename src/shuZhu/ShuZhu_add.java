package shuZhu;

import java.util.Scanner;

public class ShuZhu_add {
    public static void main(String[] ages){
        Scanner myScanner = new Scanner(System.in);
//初始化数组
        int[] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length + 1];
            //遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
            for(int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();
            //把 addNum 赋给 arrNew 最后一个元素
            arrNew[arrNew.length - 1] = addNum;
            //让 arr 指向 arrNew
            arr = arrNew;
            //输出 arr 看看效果
            System.out.println("====arr 扩容后元素情况====");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            //问用户是否继续
            System.out.println("是否继续添加 y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n') { //如果输入 n ,就结束
                break;
            }
        }while(true);
        System.out.println("你退出了添加...");
        }
}
