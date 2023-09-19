package Common.string;

public class Method_2 {
    public static void main(String[] args) {
        // 1.toUpperCaseת���ɴ�д
        String s = "heLLo";
        System.out.println(s.toUpperCase());//HELLO
        // 2.toLowerCase
        System.out.println(s.toLowerCase());//hello
        // 3.concatƴ���ַ���
        String s1 = "����";
        s1 = s1.concat("������").concat("Ѧ����").concat("together");
        System.out.println(s1);//����������Ѧ����together
        // 4.replace �滻�ַ����е��ַ�
        s1 = "���� and ������ ������ ������";
        //��s1�У��� ���е� ������ �滻��Ѧ����
        // �Ϻ����: s1.replace() ����ִ�к󣬷��صĽ�������滻����.
        // ע��� s1û���κ�Ӱ��
        String s11 = s1.replace("����", "jack");
        System.out.println(s1);//���� and ������ ������ ������
        System.out.println(s11);//jack and ������ ������ ������
        // 5.split �ָ��ַ���, ����ĳЩ�ָ��ַ���������Ҫ ת����� | \\��
        String poem = "�����յ���,���κ�����,˭֪���в�,����������";
        //�Ϻ������
        // 1. �� , Ϊ��׼�� poem ���зָ� , ����һ������
        // 2. �ڶ��ַ������зָ�ʱ������������ַ�����Ҫ���� ת��� \
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("==�ָ������===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        // 6.toCharArray ת�����ַ�����
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        // 7.compareTo �Ƚ������ַ����Ĵ�С�����ǰ�ߴ�
        // �򷵻����������ߴ��򷵻ظ����������ȣ�����0
        // �Ϻ����
        // (1) ���������ͬ������ÿ���ַ�Ҳ��ͬ���ͷ��� 0
        // (2) ���������ͬ���߲���ͬ�������ڽ��бȽ�ʱ���������ִ�С
        //     �ͷ��� if (c1 != c2) {
        //                return c1 - c2;
        //            }
        // (3) ���ǰ��Ĳ��ֶ���ͬ���ͷ��� str1.len - str2.len
        String a = "jcck";// len = 3
        String b = "jack";// len = 4
        System.out.println(a.compareTo(b)); // ����ֵ�� 'c' - 'a' = 2��ֵ
        // 8.format ��ʽ�ַ���
        /* ռλ����:
         * %s �ַ��� %c �ַ� %d ���� %.2f ������
         *
         */
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '��';
        //�����е���Ϣ��ƴ����һ���ַ���.
        String info =
                "�ҵ�������" + name + "������" + age + ",�ɼ���" + score + "�Ա���" + gender + "��ϣ�����ϲ���ң�";

        System.out.println(info);


        //�Ϻ����
        //1. %s , %d , %.2f %c ��Ϊռλ��
        //2. ��Щռλ���ɺ���������滻
        //3. %s ��ʾ������ �ַ������滻
        //4. %d ���������滻
        //5. %.2f ��ʾʹ��С�����滻���滻��ֻ�ᱣ��С������λ, ���ҽ�����������Ĵ���
        //6. %c ʹ��char �������滻
        String formatStr = "�ҵ�������%s ������%d���ɼ���%.2f �Ա���%c.ϣ�����ϲ���ң�";

        String info2 = String.format(formatStr, name, age, score, gender);

        System.out.println("info2=" + info2);
    }

}
