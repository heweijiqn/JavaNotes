package decide;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
//		int num1=50;
//	    int num2=40;
//	    if(num1>num2)
//	        System.out.println("num1大于num2");
//	    if(num1==num2)
//	        System.out.println("num2等于num2");
//	    if(num1<num2)
//	        System.out.println("num1小于num2");
		System.out.println("欢迎使用本系统 ");
		System.out.println("请输入你的年龄:");
		Scanner input=new Scanner(System.in);
		
		int age = input.nextInt();
		
		input.close();
		String str = "老年";  //定义默认值 
		
		
		if(age<0 || age>150) {
			str = "您提供的年龄不合法年龄只需要在0到150岁之间 ";
		}else if(age<18) {
			str = "你现在还是个未成年 ";
		}else if(age<65) {
			str = "你现在还需要努力工作还没退休呢 ";
			
		}
		System.out.println(str);
		
	}
	

}
