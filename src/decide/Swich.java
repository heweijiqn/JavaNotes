package decide;

import java.util.Scanner;

public class Swich {
	 public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入等级分数");
		  char c = input.next().toCharArray()[0];  // char的输入
		  
		  input.close();
	      switch(c)
	      {
	         case 'A' :
	            System.out.println("优秀"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("良好");
	            break;
	         case 'D' :
	            System.out.println("及格");
	            break;
	         case 'F' :
	            System.out.println("你需要再努力努力");
	            break;
	         default :
	            System.out.println("未知等级");
	      }
	      System.out.println("你的等级是 " + c);
	   }
		
	 
	     
}
