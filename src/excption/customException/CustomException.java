package excption.customException;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        //Ҫ��Χ�� 18 �C 120 ֮�䣬�����׳�һ���Զ����쳣
        if(!(age >= 18 && age <= 120)) {
            //�������ǿ���ͨ����������������Ϣ
            throw new AgeException("������Ҫ�� 18~120֮��");
        }
        System.out.println("������䷶Χ��ȷ.");
    }

}
//1. һ������£������Զ����쳣�Ǽ̳� RuntimeException
//2. �����Զ����쳣���� ����ʱ�쳣���ô�ʱ�����ǿ���ʹ��Ĭ�ϵĴ������
//3. ���ȽϷ���
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}