package work.com;

public class Test {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();//一般情况下
        tang.passRiver();//过河
        //过火焰山
        tang.passFireHill();

    }
}
