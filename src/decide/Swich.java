package decide;

import java.util.Scanner;

public class Swich {
	 public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("������ȼ�����");
		  char c = input.next().toCharArray()[0];  // char������
		  
		  input.close();
	      switch(c)
	      {
	         case 'A' :
	            System.out.println("����"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("����");
	            break;
	         case 'D' :
	            System.out.println("����");
	            break;
	         case 'F' :
	            System.out.println("����Ҫ��Ŭ��Ŭ��");
	            break;
	         default :
	            System.out.println("δ֪�ȼ�");
	      }
	      System.out.println("��ĵȼ��� " + c);
	   }
		
	 
	     
}
