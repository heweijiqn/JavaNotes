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
        //定义Week的枚举对象
        MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
        FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
private String name;

private Week(String name) {//构造器
        this.name = name;
        }

@Override
public String toString() {
        return name;
        }
}
