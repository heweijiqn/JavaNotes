package leiBasis.parameter;

public class MethodParameterTest {
    public static void main(String[] ages){
       MethodParameter i = new MethodParameter();
       int[] arr = {1, 2, 3};
       i.test(arr);//���÷���
       System.out.println("main �� arr ����");
     //��������
        for(int j = 0;j < arr.length; j++){
            System.out.println(arr[j]+ "\t");
        }
        System.out.println();

    }

}
