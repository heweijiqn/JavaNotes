package basis;

public class YunShuan {
	public static void main(String[] ages) {
		// + - * / %
		 int a = 10;
	     int b = 20;
	     int c = 25;
	     int d = 25;
	     System.out.println("a + b = " + (a + b) );
	     System.out.println("a - b = " + (a - b) );
	     System.out.println("a * b = " + (a * b) );
	     System.out.println("b / a = " + (b / a) );
	     System.out.println("b % a = " + (b % a) );
	     System.out.println("c % a = " + (c % a) );
	     System.out.println("a++   = " +  (a++) );
	     System.out.println("a--   = " +  (a--) );
	     // �鿴  d++ �� ++d �Ĳ�ͬ
	     System.out.println("d++   = " +  (d++) ); //�����
	     System.out.println("++d   = " +  (++d) ); //�ȼ�
	     
	     // ��ϵ�������������һ���ǲ������� 
	     // true false
	    
	     System.out.println("a == b = " + (a == b) );
	     System.out.println("a != b = " + (a != b) );
	     System.out.println("a > b = " + (a > b) );
	     System.out.println("a < b = " + (a < b) );
	     System.out.println("b >= a = " + (b >= a) );
	     System.out.println("b <= a = " + (b <= a) );
	     
	     // &  �߼� ��  && ��·��    ��Ϊ��
	     // | �߼� ��   || ��· ��   һ��Ϊ��
	     // ! �߼� �� ȡ��
	     // ^ �߼� ��� ���ߵĽ����һ�� ����true
	     
	     int e = 5;//����һ��������
	     boolean f = (e<4)&&(e++<10);
	     System.out.println("ʹ�ö�·�߼�������Ľ��Ϊ"+f);
	     System.out.println(e);
	     System.out.println("e�Ľ��Ϊ"+e);
	     /* �������Ӷ��ǲ������� ���ս��Ҳ�ǲ�������  
	      * 
	      * */
	     
	     //��ֵ�����
	     
	     /*=   C = A + B����A + B�õ���ֵ����C
		+ =	�Ӻ͸�ֵ����������������������Ҳ�������Ӹ�ֵ���������	C + = A�ȼ���C = C + A
		- =	���͸�ֵ����������������������Ҳ����������ֵ���������	C - = A�ȼ���C = C - A
		* =	�˺͸�ֵ����������������������Ҳ�������˸�ֵ���������	C * = A�ȼ���C = C * A
		/ =	���͸�ֵ����������������������Ҳ����������ֵ���������	C / = A��C �� A ͬ����ʱ�ȼ��� C = C / A
		������=	ȡģ�͸�ֵ����������������������Ҳ�����ȡģ��ֵ���������	C��= A�ȼ���C = C��A
		<< =	����λ��ֵ�����	C << = 2�ȼ���C = C << 2
		>> =	����λ��ֵ�����	C >> = 2�ȼ���C = C >> ��-2
		��=	��λ�븳ֵ�����	C��= 2�ȼ���C = C��2
		^ =	��λ���ֵ������	C ^ = 2�ȼ���C = C ^ 2
		| =	��λ��ֵ������	C | = 2�ȼ���C =
	  * */
	     byte h = 10;
	     h = (byte)(h+5);
	     System.out.println(h);
	     byte x = 10;
	     x +=5;  // ��ͬ��x= (byte)(x+5)
	     System.out.println(x);
	     
	     int num1 = 10;
	     int num2 = 20;
	     String str1 = " hello ";
	     String str2 = num1 + str1 + num2;
	     System.out.println(str2);
	     
	     String str3 = "230";
	     String str4 = num1+(num2+str3);
	     System.out.println(str4);
	     
	     boolean name = true;
	     if (name) {
	    	 System.out.println("��ϲ���¼�ɹ� ");
	     }else {
	    	 System.out.println("�ܱ�Ǹ���¼ʧ�� ");
	     }
	     //������ӵ�ʱ��Ӧ������д 
	     int m = 19;
	     int n = 21;
	     System.out.println(m+"+"+n+"="+(m+n));
	     
	     
	     // ��Ԫ����

	     
	     boolean sex = true;
	     
	     char t = sex? '��':'Ů';
	     
	     System.out.println(t);
		 System.out.println(10/4);
		 System.out.println(10.0/4);


//		 a%b=a-a/b*b �ȳ˳��ټӼ�



	}

}
