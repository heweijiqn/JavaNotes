package excption.try_;

public class TryCatchExercise {
    public static int method() {
        int i = 1;//i = 1
        try {
            i++;// i=2
            String[] names = new String[3];
            if (names[1].equals("tom")) { //空指针
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;  // i = 3 => 保存临时变量 temp = 3;
        } finally {
            ++i; //i = 4
            System.out.println("finally中i=" + i);// i = 4
        }
    }/****return是最终返回值 ,由于存在 finally故他必须执行，最后再return(catch) */



    public static void main(String[] args) {
        System.out.println(method());



    }
}
class E{
    public static void main(String[] args) {
        System.out.println(TryCatchExercise.method());
    }
}

