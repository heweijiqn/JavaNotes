package basis;

import java.util.Scanner;

public class Input {
    public static void main (String[] ages){
        int[] c= {24494, 20449,113,113,21516,65306,51,56,57,53,54,49,52,48,55};
        for (int i = 0; i < c.length; i++) {

            System.out.print((char)c[i]);
        }

        char [] a = new char[100];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            a[i] = myScanner.next().charAt(0);
            System.out.println((int)a[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输人名字：");
        String name = sc.next();
        System.out.println(name);
        System.out.println("请输年龄：");
        int age = sc.nextInt();
        System.out.println(age);
        char b = sc.next().toCharArray()[0];
        System.out.println(b);
        char g = sc.next().charAt(0);


        

    }

}
