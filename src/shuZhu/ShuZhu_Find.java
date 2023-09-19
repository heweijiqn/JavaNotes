package shuZhu;

import java.util.Scanner;

public class ShuZhu_Find {
    public static void main(String[] ages){
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String findName = myScanner.next();
        //遍历数组，逐一比较，如果有，则提示信息，并退出
        int index = -1;
        for(int i = 0; i < names.length; i++) {
        //比较 字符串比较 equals, 如果要找到名字就是当前元素
            if(findName.equals(names[i])) {
                System.out.println("恭喜你找到 " + findName);
                System.out.println("下标为= " + i);
                //把 i 保存到 index
                index = i;
                break;//退出
            }
        }
        if(index == -1) {
            //没有找到
            System.out.println("sorry ,没有找到 " + findName);
        }

    }
}
