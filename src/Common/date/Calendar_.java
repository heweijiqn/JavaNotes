package Common.date;


import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //1. Calendar��һ�������࣬ ���ҹ�������private
        //2. ����ͨ�� getInstance() ����ȡʵ��
        //3. �ṩ�����ķ������ֶ��ṩ������Ա
        //4. Calendarû���ṩ��Ӧ�ĸ�ʽ�����࣬�Լ���������(���)
        //5. ���������Ҫ���� 24Сʱ��������ȡʱ�䣬 Calendar.HOUR ==�ĳ�=> Calendar.HOUR_OF_DAY

        Calendar c = Calendar.getInstance(); //�������������//�Ƚϼ򵥣�����
        System.out.println("c=" + c);
        //2.��ȡ���������ĳ�������ֶ�
        System.out.println("�꣺" + c.get(Calendar.YEAR));
        // ����ΪʲôҪ + 1, ��ΪCalendar ������ʱ���ǰ��� 0 ��ʼ���
        System.out.println("�£�" + (c.get(Calendar.MONTH) + 1));
        System.out.println("�գ�" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Сʱ��" + c.get(Calendar.HOUR));
        System.out.println("���ӣ�" + c.get(Calendar.MINUTE));
        System.out.println("�룺" + c.get(Calendar.SECOND));
        //Calender û��ר�ŵĸ�ʽ��������������Ҫ����Ա�Լ��������ʾ
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH) +
                " " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) );

    }


}
