package leiBasis.recrsion;

import leiBasis.recrsion.Recursion;

public class RecursionExercise {
    public static void main(String[] ages){
        Recursion i =new Recursion();
        int j = i.fibonacci(6);
        if(j != -1){
            System.out.println("n��Ӧ�Ķ�Ӧ��쳲�������"+ j);
        }
        int day = 6;
        int peachNum = i.peach(day);
        if(peachNum != -1) {
            System.out.println("�� " + day + "����" + peachNum + "������");
        }



    }

}
