package mianXiang.Extends;

public class Sub_Base_Top {
    public static void main(String[] args) {
        System.out.println("===��1������====");
        Sub sub = new Sub(); //������������� sub
        System.out.println("===��2������====");
        Sub sub2 = new Sub("jack"); //������������� sub2
        System.out.println("===��3����====");
        Sub sub3 = new Sub("king", 10); //������������� sub2
        //sub.sayOk();
    }
}
