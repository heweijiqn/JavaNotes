package basis;

public class ShuJiuLeiXing {
	public static void main(String[] ages) {
		//�ֽ���	byte	1 �ֽ�	-128~127
		//������	short	2 �ֽ�	-32768~32767
		//����	int	4 �ֽ�	-2147483648~2147483647
		//������	long	8 �ֽ�	-9223372036854775808L~9223372036854775807L
		//�����ȸ�����	float	4 �ֽ�	+/-3.4E+38F��6~7 ����Чλ��
		//˫���ȸ�����	double	8 �ֽ�	+/-1.8E+308 (15 ����Чλ��
		//�ַ���	char	2 �ֽ�	ISO ��һ�ַ���
		//������	boolean	1 �ֽ�	true �� false
		
		double lutu = 2348.4; // ���� double ���͵ı��������ڴ洢���̾���
	    int num = 2; // ���� int ���͵ı��������ڴ洢����
        Long m1 = 3l;
        System.out.println(m1);
        //��longת����int���ܻ�����ʧ
        // int m2 = 4L;
        // System.out.println(m2);


        float total = (float) (lutu * num); // ���� float ���͵ı��������ڴ洢�ܾ���
	    System.out.println("���� AB ���ع���Ҫ��ʻ��" + total + " ��");
	    
	    
	    char a = 'A';    // �� char ���͵� a ������ֵΪ A������Ӧ�� ASCII ֵΪ 65
	    char b = 'B';    // �� char ���͵� b ������ֵΪ B������Ӧ�� ASCII ֵΪ 66
	    System.out.println("A �� ASCII ֵ�� B �� ASCII ֵ��ӽ��Ϊ��"+(a+b));
	    
	  //  \n	���� (0x0a)
	  // \r	�س� (0x0d)
	  //  \f	��ҳ��(0x0c)
	  //  \b	�˸� (0x08)
	  //  \0	���ַ� (0x0)
	  // \s	�ո� (0x20)
	  //  \t	�Ʊ��
	  //  \"	˫����
	  //  \'	������
	  //  \\	��б��
	
	    
	    //  ��������ת�������������¹���

	    // ���ܶ�boolean���ͽ�������ת����

	    //���ܰѶ�������ת���ɲ������Ķ���

	    // �ڰ������������ת��Ϊ����С������ʱ����ʹ��ǿ������ת����

	    // ת�������п��ܵ����������ʧ���ȣ����磺
	    // С����ת��Ϊ��������Ϊ�Զ�ת�� 
	    
	    char c1='a';//����һ��char����
        int i1 = c1;//char�Զ�����ת��Ϊint
        System.out.println("char�Զ�����ת��Ϊint���ֵ����"+i1);
        
        char c2 = 'A';//����һ��char����
        int i2 = c2+1;//char ���ͺ� int ���ͼ���
        System.out.println("char���ͺ�int������ֵ����"+i2);
        
        int li = 123;
        byte p = (byte)li;
        //ǿ������ת��Ϊbyte
        System.out.println("intǿ������ת��Ϊbyte���ֵ����"+p);
        
        //10 010 0x10  10�� 8�� 16 ��
        
        double d = 5.1;
        System.out.println(d);
        
        // float f = 5.1f;
        float f = (float)5.1;  //ǿ������ת��
        System.out.println(f);


        boolean lone = true;  // true�����һ��  false �����2��  
        if(lone) {
        	System.out.println("��ϲ���¼�ɹ� ");
        }else {
        	System.out.println("�ܱ�Ǹ���¼ʧ�� ");
        }
        double n22 = 2.1111f;
        System.out.println(n22);
        char n33 = 'a'+1;
//        System.out.println((int) n33);
        System.out.println(n33);
        double m88 = 11l;
        System.out.println(m88);

//        �������
        char c11 = '��';
        char c22 = 'Ů';
        System.out.println(c11+c22);  // 52906


//        ����������������һ�𣬻�ת�������ļ���
//        ����ת��ʱ���жϷ�Χ���Ǽ���
//        byte short int �����ת����int����
	}



}
