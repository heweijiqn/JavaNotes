package enumeration;

public class Exercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week:weeks){
            System.out.println(week);
        }
        System.out.println(weeks);


    }
}
enum Week   {
        //����Week��ö�ٶ���
        MONDAY("����һ"), TUESDAY("���ڶ�"), WEDNESDAY("������"), THURSDAY("������"),
        FRIDAY("������"), SATURDAY("������"), SUNDAY("������");
private String name;

private Week(String name) {//������
        this.name = name;
        }

@Override
public String toString() {
        return name;
        }
}
