package excption.try_;

public class TryCatchExercise {
    public static int method() {
        int i = 1;//i = 1
        try {
            i++;// i=2
            String[] names = new String[3];
            if (names[1].equals("tom")) { //��ָ��
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;  // i = 3 => ������ʱ���� temp = 3;
        } finally {
            ++i; //i = 4
            System.out.println("finally��i=" + i);// i = 4
        }
    }/****return�����շ���ֵ ,���ڴ��� finally��������ִ�У������return(catch) */



    public static void main(String[] args) {
        System.out.println(method());



    }
}
class E{
    public static void main(String[] args) {
        System.out.println(TryCatchExercise.method());
    }
}

