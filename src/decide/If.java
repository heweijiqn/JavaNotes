package decide;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
//		int num1=50;
//	    int num2=40;
//	    if(num1>num2)
//	        System.out.println("num1����num2");
//	    if(num1==num2)
//	        System.out.println("num2����num2");
//	    if(num1<num2)
//	        System.out.println("num1С��num2");
		System.out.println("��ӭʹ�ñ�ϵͳ ");
		System.out.println("�������������:");
		Scanner input=new Scanner(System.in);
		
		int age = input.nextInt();
		
		input.close();
		String str = "����";  //����Ĭ��ֵ 
		
		
		if(age<0 || age>150) {
			str = "���ṩ�����䲻�Ϸ�����ֻ��Ҫ��0��150��֮�� ";
		}else if(age<18) {
			str = "�����ڻ��Ǹ�δ���� ";
		}else if(age<65) {
			str = "�����ڻ���ҪŬ��������û������ ";
			
		}
		System.out.println(str);
		
	}
	

}
