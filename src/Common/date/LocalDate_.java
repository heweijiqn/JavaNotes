package Common.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class LocalDate_ {
    public static void main(String[] args) {
        //����������
        //�Ϻ����
        //1. ʹ��now() ���ر�ʾ��ǰ����ʱ��� ����
        LocalDateTime ldt = LocalDateTime.now(); //LocalDate.now();//LocalTime.now()
        System.out.println(ldt);

        //2. ʹ��DateTimeFormatter ���������и�ʽ��
        // ���� DateTimeFormatter����

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        TemporalAccessor parse = dateTimeFormatter.parse("1921-07-23 12:00:00");
        TemporalAccessor parse1 = dateTimeFormatter.parse("2020-07-01 12:00:00");
        //����ʱ�������ٷ���
        Duration between = Duration.between(LocalDateTime.from(parse), LocalDateTime.from(parse1));
        System.out.println(between.toMinutes());
        String format = dateTimeFormatter.format(ldt);
        System.out.println("��ʽ��������=" + format);

        System.out.println("��=" + ldt.getYear());
        System.out.println("��=" + ldt.getMonth());
        System.out.println("��=" + ldt.getMonthValue());
        System.out.println("��=" + ldt.getDayOfMonth());
        System.out.println("ʱ=" + ldt.getHour());
        System.out.println("��=" + ldt.getMinute());
        System.out.println("��=" + ldt.getSecond());

        LocalDate now = LocalDate.now(); //���Ի�ȡ������
        LocalTime now2 = LocalTime.now();//��ȡ��ʱ����


        //�ṩ plus�� �� minus�� �������ԶԵ�ǰʱ����мӻ��߼�
        //����890�����ʲôʱ�� �� ������-ʱ����
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890���=" + dateTimeFormatter.format(localDateTime));

        //������ 3456����ǰ��ʲôʱ�򣬰� ������-ʱ�������
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456����ǰ ����=" + dateTimeFormatter.format(localDateTime2));


        //1.ͨ�� ��̬���� now() ��ȡ��ʾ��ǰʱ����Ķ���
        Instant now1 = Instant.now();
        System.out.println(now);
        //2. ͨ�� from ���԰� Instantת�� Date
        Date date = Date.from(now1);
        System.out.println(date);
        //3. ͨ�� date��toInstant() ���԰� date ת��Instant����
        Instant instant = date.toInstant();
        System.out.println(instant);


    }
}
