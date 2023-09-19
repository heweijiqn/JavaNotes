package basis;

public class ShuJiuLeiXing {
	public static void main(String[] ages) {
		//字节型	byte	1 字节	-128~127
		//短整型	short	2 字节	-32768~32767
		//整型	int	4 字节	-2147483648~2147483647
		//长整型	long	8 字节	-9223372036854775808L~9223372036854775807L
		//单精度浮点型	float	4 字节	+/-3.4E+38F（6~7 个有效位）
		//双精度浮点型	double	8 字节	+/-1.8E+308 (15 个有效位）
		//字符型	char	2 字节	ISO 单一字符集
		//布尔型	boolean	1 字节	true 或 false
		
		double lutu = 2348.4; // 定义 double 类型的变量，用于存储单程距离
	    int num = 2; // 定义 int 类型的变量，用于存储次数
        Long m1 = 3l;
        System.out.println(m1);
        //从long转换到int可能会有损失
        // int m2 = 4L;
        // System.out.println(m2);


        float total = (float) (lutu * num); // 定义 float 类型的变量，用于存储总距离
	    System.out.println("往返 AB 两地共需要行驶：" + total + " 米");
	    
	    
	    char a = 'A';    // 向 char 类型的 a 变量赋值为 A，所对应的 ASCII 值为 65
	    char b = 'B';    // 向 char 类型的 b 变量赋值为 B，所对应的 ASCII 值为 66
	    System.out.println("A 的 ASCII 值与 B 的 ASCII 值相加结果为："+(a+b));
	    
	  //  \n	换行 (0x0a)
	  // \r	回车 (0x0d)
	  //  \f	换页符(0x0c)
	  //  \b	退格 (0x08)
	  //  \0	空字符 (0x0)
	  // \s	空格 (0x20)
	  //  \t	制表符
	  //  \"	双引号
	  //  \'	单引号
	  //  \\	反斜杠
	
	    
	    //  数据类型转换必须满足如下规则：

	    // 不能对boolean类型进行类型转换。

	    //不能把对象类型转换成不相关类的对象。

	    // 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

	    // 转换过程中可能导致溢出或损失精度，例如：
	    // 小容量转化为大容量称为自动转换 
	    
	    char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        
        int li = 123;
        byte p = (byte)li;
        //强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+p);
        
        //10 010 0x10  10进 8进 16 进
        
        double d = 5.1;
        System.out.println(d);
        
        // float f = 5.1f;
        float f = (float)5.1;  //强制类型转换
        System.out.println(f);


        boolean lone = true;  // true输入第一个  false 输出第2个  
        if(lone) {
        	System.out.println("恭喜你登录成功 ");
        }else {
        	System.out.println("很抱歉你登录失败 ");
        }
        double n22 = 2.1111f;
        System.out.println(n22);
        char n33 = 'a'+1;
//        System.out.println((int) n33);
        System.out.println(n33);
        double m88 = 11l;
        System.out.println(m88);

//        码字相加
        char c11 = '男';
        char c22 = '女';
        System.out.println(c11+c22);  // 52906


//        当多种数据类型在一起，会转换成最大的计算
//        数据转换时先判断范围，是即可
//        byte short int 计算会转化成int计算
	}



}
