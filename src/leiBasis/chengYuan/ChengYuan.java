package leiBasis.chengYuan;

public class ChengYuan {
    //1. public ��ʾ�����ǹ���
    //2. void �� ��ʾ����û�з���ֵ
    //3. speak() : speak �Ƿ������� () �β��б�
    //4. {} �����壬����д����Ҫִ�еĴ���
    public void speak() {
        System.out.println("����һ������");
    }
    public void cal01(){
        int res = 0;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal01 ���� ������=" + res);
    }
    //��� cal02 ��Ա����,�÷������Խ���һ���� n������� 1+..+
    //1. (int n) �β��б� ��ʾ��ǰ��һ���β� n, ���Խ����û�����
    public void cal02(int n) {
        //ѭ�����
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02 ���� ������=" + res);
    }
    //��� getSum ��Ա����,���Լ���num1+num2��ֵ
    //1. public ��ʾ�����ǹ�����
    //2. int :��ʾ����ִ�к󣬷���һ�� int ֵ
    //3. getSum ������
    //4. (int num1, int num2) �β��б�2 ���βΣ����Խ����û������������
    //5. return res; ��ʾ�� res ��ֵ�� ����
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

}
