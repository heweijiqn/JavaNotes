package leiBasis.chengYuan;


public class ChengYuanTest {
   public static void main(String[] ages){
       ChengYuan p1 = new ChengYuan();
       p1.speak(); //���÷���
       p1.cal01(); //���� cal01 ����
       p1.cal02(5); //���� cal02 ������ͬʱ�� n = 5
       p1.cal02(10); //���� c
       int returnRes = p1.getSum(10, 20);
       System.out.println("getSum �������ص�ֵ=" + returnRes);

   }
   /*
   (1) �β��б���ʾ��Ա�������� cal(int n) �� getSum(int num1, int num2)
   (2) �����������ͣ���ʾ��Ա�������, void ��ʾû�з���ֵ
   (3) �������壺��ʾΪ��ʵ��ĳһ���ܴ����
   (4) return ��䲻�Ǳ����

    */

}
