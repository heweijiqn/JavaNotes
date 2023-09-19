package Common.homework;

public class Home_3 {
    public static void main(String[] args) {
        String str = "abcHsp U 1234";
        countStr(str);
    }

    /**
     * �����ַ������ж������ж��ٸ���д��ĸ�����ٸ�Сд��ĸ�����ٸ�����
     * ˼·����
     * (1) �����ַ�������� char �� '0'~'9' ����һ������
     * (2) ��� char �� 'a'~'z' ����һ��Сд��ĸ
     * (3) ��� char �� 'A'~'Z' ����һ����д��ĸ
     * (4) ʹ��������������¼ ͳ�ƽ��
     */
    public static void countStr(String str) {
        if (str == null) {
            System.out.println("���벻��Ϊ null");
            return;
        }
        int strLen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("������ " + numCount);
        System.out.println("Сд��ĸ�� " + lowerCount);
        System.out.println("��д��ĸ�� " + upperCount);
        System.out.println("�����ַ��� " + otherCount);
    }
}
