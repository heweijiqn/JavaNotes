package excption.try_;

public class TryCatch {
    public static void main(String[] args) {

        //1. ����쳣�����ˣ����쳣��������Ĵ��벻��ִ�У�ֱ�ӽ��뵽catch��
        //2. ����쳣û�з�������˳��ִ��try�Ĵ���飬������뵽catch
        //3. ���ϣ�������Ƿ����쳣����ִ��ĳ�δ���(����ر����ӣ��ͷ���Դ��)��ʹ�����´���- finally
        try {
            String str = "hwj";
            int a = Integer.parseInt(str);
            System.out.println("���֣�" + a);
        } catch (NumberFormatException e) {
            System.out.println("�쳣��Ϣ=" + e.getMessage());
        } finally {
            System.out.println("finally����鱻ִ��...");
        }

        System.out.println("�������...");

    }

}
