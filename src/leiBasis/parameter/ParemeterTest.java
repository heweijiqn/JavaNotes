package leiBasis.parameter;

public class ParemeterTest {
    public static void main(String[] ages){
        int a = 10;
        int b = 20;
        //���� paremeter ���� ���� obj
        Parameter obj = new Parameter();
        obj.swap(a, b); //���� swap
        System.out.println("main ���� �� a=" + a + " b=" + b);//a=10 b=2

    }
}
