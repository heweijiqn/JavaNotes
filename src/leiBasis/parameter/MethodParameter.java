package leiBasis.parameter;

public class MethodParameter {
    //MethodParameter 类中编写一个方法 test
    //可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
/*
数组传递的是地址它相当于一个对象
引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参*/
    public void test(int[] arr) {
        arr[0] = 200;//修改元素
        //遍历数组
        System.out.println(" test 的 arr 数组 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
