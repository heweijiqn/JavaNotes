package Common.homework;

public class Home_2 {
    public static void main(String[] args) {

        String name = "abc";
        String pwd = "123456";
        String email = "ti@i@sohu.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("��ϲ�㣬ע��ɹ�~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * �����û��������롢���䣬�����Ϣ¼����ȷ������ʾע��ɹ������������쳣����
     * Ҫ��
     * (1) �û�������Ϊ2��3��4
     * (2) ����ĳ���Ϊ6��Ҫ��ȫ������  isDigital
     * (3) �����а���@��.   ����@��.��ǰ��
     * <p>
     * ˼·����
     * (1) �ȱ�д���� userRegister(String name, String pwd, String email) {}
     * (2) ��� ��������ݽ���У�ˣ�������������⣬���׳��쳣��������ʾ
     * (3) ������дһ���������ж� �����Ƿ�ȫ���������ַ� boolean
     */
    public static void userRegister(String name, String pwd, String email) {

        //�ټ���һЩУ��
        if(!(name != null && pwd != null && email != null)) {
            throw  new RuntimeException("��������Ϊnull");
        }

        //����
        //��һ��
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("�û�������Ϊ2��3��4");
        }

        //�ڶ���
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("����ĳ���Ϊ6��Ҫ��ȫ������");
        }

        //������
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("�����а���@��.   ����@��.��ǰ��");
        }


    }

    //������дһ���������ж� �����Ƿ�ȫ���������ַ� boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

}
