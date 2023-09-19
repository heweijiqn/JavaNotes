package leiBasis.mothods;

public class Methods {
	public static void main(String[] ages) {
		int i = 5;
	    int j = 2;
	    int k = max(i, j);  //变量接收  
	    //调用方法  类名.方法（参）
	    System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
	    // 输出return
		/*
//  修饰符 返回值类型 方法名(参数类型 参数名){
    ...
              方法体、
    ...
    return 返回值;-
//方法包含一个方法头和一个方法体 下面是一个方法的所有部分：
//修饰符 修饰符 这是可选的告诉编译器 如何调用该方法 定义了该方法的访问类型。
//返回值类型 方法可能会返回值 returnValueType 是方法返回值的数据类型 有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
//方法名 方法的实际名称 方法名和参数表共同构成方法签名。
//参数类型 参数像是一个占位符 当方法被调用时 传递值给参数 这个值被称为实参或变量 参数列表是指方法的参数类型 顺序和参数的个数 参数是可选的 方法可以不包含任何参数。
//方法体 方法体包含具体的语句 定义该方法的功能。
		 */
//返回值无要写void,不是void要写return
	    //方法调用不一定在主方法 在能调用的方法即可
		
	}
	 public static int max(int num1, int num2) {
	      int result;
	      if (num1 > num2)
	         result = num1;
	      else
	         result = num2;
	 
	      return result; 
	   }
	 
	
		
	

}
