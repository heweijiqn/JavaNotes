package leiBasis.recrsion;

import leiBasis.recrsion.Recursion;

public class RecursionExercise {
    public static void main(String[] ages){
        Recursion i =new Recursion();
        int j = i.fibonacci(6);
        if(j != -1){
            System.out.println("n对应的对应的斐波那契数"+ j);
        }
        int day = 6;
        int peachNum = i.peach(day);
        if(peachNum != -1) {
            System.out.println("第 " + day + "天有" + peachNum + "个桃子");
        }



    }

}
