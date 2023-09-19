package mianXiang.equal;

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//�����������ͣ��ж�ֵ�Ƿ����

        //equals ������Դ����ô�鿴.
        //�ѹ�����equals������ֱ������ctrl+b
        //�����ʹ�ò���. �Լ�����. ����ʹ��.

        /*
        //����ҿ���Jdk��Դ�� String��� equals����
        //��Object��equals������д��,����˱Ƚ������ַ���ֵ�Ƿ���ͬ
        public boolean equals(Object anObject) {
        if (this == anObject) {//�����ͬһ������
            return true;//����true
        }
        if (anObject instanceof String) {//�ж�����
            String anotherString = (String)anObject;//����ת��
            int n = value.length;
            if (n == anotherString.value.length) {//���������ͬ
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//Ȼ��һ��һ���ıȽ��ַ�
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//��������ַ����������ַ�����ȣ��򷵻�true
            }
        }
        return false;//����ȽϵĲ����ַ�������ֱ�ӷ���false
    }
         */


        "hello".equals("abc");

        //����Object��� equals ��
        /*
        //��Object ��equals ����Ĭ�Ͼ��ǱȽ϶����ַ�Ƿ���ͬ
        //Ҳ�����ж����������ǲ���ͬһ������.
         public boolean equals(Object obj) {
            return (this == obj);
        }
         */


        /*
        //��Դ����Կ��� Integer Ҳ��д��Object��equals����,
        //������ж�����ֵ�Ƿ���ͬ
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);

        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true




    }
}
class B {

}
class A extends B {

}
