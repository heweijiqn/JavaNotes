package leiBasis.exercise;

public class Home {
    public static void main(String[] args){//ÔËÐÐËü
        Domo d1=new Domo();
        Domo d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);
    }

}
