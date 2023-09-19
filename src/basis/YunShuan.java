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
	     // 查看  d++ 与 ++d 的不同
	     System.out.println("d++   = " +  (d++) ); //先输出
	     System.out.println("++d   = " +  (++d) ); //先加
	     
	     // 关系运算符的运算结果一定是布尔类型 
	     // true false
	    
	     System.out.println("a == b = " + (a == b) );
	     System.out.println("a != b = " + (a != b) );
	     System.out.println("a > b = " + (a > b) );
	     System.out.println("a < b = " + (a < b) );
	     System.out.println("b >= a = " + (b >= a) );
	     System.out.println("b <= a = " + (b <= a) );
	     
	     // &  逻辑 与  && 短路与    都为真
	     // | 逻辑 或   || 短路 或   一个为真
	     // ! 逻辑 非 取反
	     // ^ 逻辑 异或 两边的结果不一样 就是true
	     
	     int e = 5;//定义一个变量；
	     boolean f = (e<4)&&(e++<10);
	     System.out.println("使用短路逻辑运算符的结果为"+f);
	     System.out.println(e);
	     System.out.println("e的结果为"+e);
	     /* 两边算子都是布尔类型 最终结果也是布尔类型  
	      * 
	      * */
	     
	     //赋值运算符
	     
	     /*=   C = A + B将把A + B得到的值赋给C
		+ =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
		- =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C - A
		* =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
		/ =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A，C 与 A 同类型时等价于 C = C / A
		（％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
		<< =	左移位赋值运算符	C << = 2等价于C = C << 2
		>> =	右移位赋值运算符	C >> = 2等价于C = C >> の-2
		＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
		^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
		| =	按位或赋值操作符	C | = 2等价于C =
	  * */
	     byte h = 10;
	     h = (byte)(h+5);
	     System.out.println(h);
	     byte x = 10;
	     x +=5;  // 等同于x= (byte)(x+5)
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
	    	 System.out.println("恭喜你登录成功 ");
	     }else {
	    	 System.out.println("很抱歉你登录失败 ");
	     }
	     //输出连接的时候应该这样写 
	     int m = 19;
	     int n = 21;
	     System.out.println(m+"+"+n+"="+(m+n));
	     
	     
	     // 三元运算

	     
	     boolean sex = true;
	     
	     char t = sex? '男':'女';
	     
	     System.out.println(t);
		 System.out.println(10/4);
		 System.out.println(10.0/4);


//		 a%b=a-a/b*b 先乘除再加减



	}

}
