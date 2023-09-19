package leiBasis.parameter;

public class MethodParameterTest {
    public static void main(String[] ages){
       MethodParameter i = new MethodParameter();
       int[] arr = {1, 2, 3};
       i.test(arr);//调用方法
       System.out.println("main 的 arr 数组");
     //遍历数组
        for(int j = 0;j < arr.length; j++){
            System.out.println(arr[j]+ "\t");
        }
        System.out.println();

    }

}
