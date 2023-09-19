package excption.try_;

public class TryCatchFinal {
    public static void main(String[] args) {
        //1.���try������п����ж���쳣
        //2.����ʹ�ö��catch �ֱ𲶻�ͬ���쳣����Ӧ����
        //3.Ҫ�������쳣д��ǰ�棬�����쳣д�ں���
        try {
            Person person = new Person();
            //person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("��ָ���쳣=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("�����쳣=" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }


    }

}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}