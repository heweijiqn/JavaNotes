package rentout.utolity;

import java.util.Scanner;

/**
 �����������:
 �������������û����룬�����ܹ����ճ���Ա�����󣬵õ��û��Ŀ���̨���롣
 */
public class Utility {
    //��̬���ԡ�����
    private static Scanner scanner = new Scanner(System.in);


    /**
     * ���ܣ���ȡ���������һ���˵�ѡ�ֵ��1����5�ķ�Χ
     *
     * @return 1����5
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);//����һ���ַ����ַ���
            c = str.charAt(0);//���ַ���ת�����ַ�char����
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4' && c != '5') {
                System.out.print("ѡ��������������룺");
            } else break;
        }
        return c;
    }


    /**
     * ���ܣ���ȡ���������һ���ַ�
     * @return һ���ַ�
     */
    public static char readChar() {
        String str = readKeyBoard(1, false);//����һ���ַ�
        return str.charAt(0);
    }
    /**
     * ���ܣ���ȡ���������һ���ַ������ֱ�Ӱ��س����򷵻�ָ����Ĭ��ֵ�����򷵻�������Ǹ��ַ�
     * @param defaultValue ָ����Ĭ��ֵ
     * @return Ĭ��ֵ��������ַ�
     */

    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);//Ҫô�ǿ��ַ�����Ҫô��һ���ַ�
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    /**
     * ���ܣ���ȡ������������ͣ�����С��2λ
     * @return ����
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, false);//һ������������<=10λ
            try {
                n = Integer.parseInt(str);//���ַ���ת��������
                break;
            } catch (NumberFormatException e) {
                System.out.print("��������������������룺");
            }
        }
        return n;
    }
    /**
     * ���ܣ���ȡ��������� ������Ĭ��ֵ�����ֱ�ӻس����򷵻�Ĭ��ֵ�����򷵻����������
     * @param defaultValue ָ����Ĭ��ֵ
     * @return ������Ĭ��ֵ
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultValue;
            }

            //�쳣����...
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("��������������������룺");
            }
        }
        return n;
    }

    /**
     * ���ܣ���ȡ���������ָ�����ȵ��ַ���
     * @param limit ���Ƶĳ���
     * @return ָ�����ȵ��ַ���
     */

    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    /**
     * ���ܣ���ȡ���������ָ�����ȵ��ַ�����Ĭ��ֵ�����ֱ�ӻس�������Ĭ��ֵ�����򷵻��ַ���
     * @param limit ���Ƶĳ���
     * @param defaultValue ָ����Ĭ��ֵ
     * @return ָ�����ȵ��ַ���
     */

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }


    /**
     * ���ܣ���ȡ���������ȷ��ѡ�Y��N
     * ��С�Ĺ��ܣ���װ��һ��������.
     * @return Y��N
     */
    public static char readConfirmSelection() {
        System.out.println("���������ѡ��(Y/N): ��С��ѡ��");
        char c;
        for (; ; ) {//����ѭ��
            //����������ܵ��ַ���ת���˴�д��ĸ
            //y => Y n=>N
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("ѡ��������������룺");
            }
        }
        return c;
    }

    /**
     * ���ܣ� ��ȡһ���ַ���
     * @param limit ��ȡ�ĳ���
     * @param blankReturn ���Ϊtrue ,��ʾ ���Զ����ַ�����
     * 					  ���Ϊfalse��ʾ ���ܶ����ַ�����
     *
     *	�������Ϊ�գ������������limit�ĳ��ȣ��ͻ���ʾ�������롣
     * @return
     */
    private static String readKeyBoard(int limit, boolean blankReturn) {

        //�������ַ���
        String line = "";

        //scanner.hasNextLine() �ж���û����һ��
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();//��ȡ��һ��

            //���line.length=0, ���û�û�������κ����ݣ�ֱ�ӻس�
            if (line.length() == 0) {
                if (blankReturn) return line;//���blankReturn=true,���Է��ؿմ�
                else continue; //���blankReturn=false,�����ܿմ���������������
            }

            //����û���������ݴ����� limit������ʾ��д����
            //����û�������� >0 <= limit ,�Ҿͽ���
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("���볤�ȣ����ܴ���" + limit + "���������������룺");
                continue;
            }
            break;
        }

        return line;
    }
}

