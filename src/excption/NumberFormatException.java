package excption;

public class NumberFormatException {
    public static void main(String[] args) {
        String name = "��˳ƽ����";
        //��String ת�� int
        int num = Integer.parseInt(name);//�׳�NumberFormatException
        System.out.println(num);//1234

    }
}
