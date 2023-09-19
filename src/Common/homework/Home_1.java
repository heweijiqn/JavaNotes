package Common.homework;

public class Home_1 {
    public static void main(String[] args) {
        //����
        String str = "abcdef";
        System.out.println("===����ǰ===");
        System.out.println(str);
        try {
            str = reverse(str, 9, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;

        }
        System.out.println("===������===");
        System.out.println(str);
    }

    /**
     * (1) ���ַ�����ָ�����ֽ��з�ת�����罫"abcdef"��תΪ"aedcbf"
     * (2) ��д���� public static String reverse(String  str, int start , int end) �㶨
     * ˼·����
     * (1) �Ȱѷ�������ȷ��
     * (2) �� String ת�� char[] ����Ϊchar[] ��Ԫ���ǿ��Խ�����
     * (3) ��������ʾ��ͼ
     * (4) ����ʵ��
     */
    public static String reverse(String str, int start, int end) {


        //������Ĳ�����һ����֤

        //(1) д����ȷ�����
        //(2) Ȼ��ȡ������
        //(3) ����д�����˼·�Ͳ���  ȡ����һ�ֱ��˼��
        if(!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("��������ȷ");
        }

        char[] chars = str.toCharArray();
        char temp = ' '; //������������
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //ʹ��chars ���¹���һ��String ���ؼ���
        return new String(chars);

    }
}
