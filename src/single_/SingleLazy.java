package single_;

public class SingleLazy {
    public static void main(String[] args) {
        //new Cat("���S");
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);


        //�ٴ��{��getInstance
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);//T

    }

}
//ϣ���ڳ����\���^���У�ֻ�܄���һ��Cat����
//ʹ�Æ���ģʽ
class Cat {
    private String name;
    public static  int n1 = 999;
    private static Cat cat ; //Ĭ�J��null

    //���E
    //1.��Ȼ������˽�л�
    //2.���xһ��static�o�B���Ԍ���
    //3.�ṩһ��public��static���������Է���һ��Cat����
    //4.�Нhʽ��ֻ�Ю��Ñ�ʹ��getInstance�r���ŷ���cat����, �����ٴ��{�Õr���������ϴ΄�����cat����
    //  �Ķ����C�ˆ���
    private Cat(String name) {
        System.out.println("�������{��...");
        this.name = name;
    }
    public static Cat getInstance() {

        if(cat == null) {//���߀�]�Є���cat����
            cat = new Cat("С�ɐ�");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}