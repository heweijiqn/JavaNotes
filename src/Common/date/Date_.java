package Common.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {


        //1. ��ȡ��ǰϵͳʱ��
        //2. �����Date ������java.util��
        //3. Ĭ����������ڸ�ʽ�ǹ���ķ�ʽ, ���ͨ����Ҫ�Ը�ʽ����ת��
        Date d1 = new Date(); //��ȡ��ǰϵͳʱ��
        System.out.println("��ǰ����=" + d1);

        Date d2 = new Date(9234567); //ͨ��ָ���������õ�ʱ��
        System.out.println("d2=" + d2); //��ȡĳ��ʱ���Ӧ�ĺ�����



        //1. ���� SimpleDateFormat���󣬿���ָ����Ӧ�ĸ�ʽ
        //2. ����ĸ�ʽʹ�õ���ĸ�ǹ涨�ã�������д

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss E");

        String format = sdf.format(d1); // format:������ת����ָ����ʽ���ַ���
        System.out.println("��ǰ����=" + format);


        //1. ���԰�һ����ʽ����String ת�ɶ�Ӧ�� Date
        //2. �õ�Date ��Ȼ�����ʱ�����ǰ��չ������ʽ�����ϣ��ָ����ʽ�������Ҫת��
        //3. �ڰ�String -> Date �� ʹ�õ� sdf ��ʽ��Ҫ�������String�ĸ�ʽһ����������׳�ת���쳣
        String s = "1996��01��01�� 10:20:30 ����һ";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + sdf.format(parse));

    }
}
