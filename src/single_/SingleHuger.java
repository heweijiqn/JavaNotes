package single_;

public class SingleHuger {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("С��");
//        GirlFriend xb = new GirlFriend("С��");

        //ͨ���������Ի�ȡ����
//        GirlFriend instance = GirlFriend.getInstance();
//        System.out.println(instance);

//        GirlFriend instance2 = GirlFriend.getInstance();
//        System.out.println(instance2);
//
//        System.out.println(instance == instance2);//T
        System.out.println(GirlFriend.n1);

        //...


    }
}
//��һ���࣬ GirlFriend
//ֻ����һ��Ů����
class GirlFriend {

    private String name;
    public static  int n1 = 100;
    //Ϊ���ܹ��ھ�̬�����У����� gf������Ҫ��������Ϊstatic
    //����ͨ�����������Č���, �I�hʽ������Ʉ����ˌ��󣬵��Ǜ]��ʹ��.
    private static GirlFriend gf = new GirlFriend("С���");

    //��α�������ֻ�ܴ���һ�� GirlFriend ����
    //����[����ģʽ-����ʽ]
    //1. ��������˽�л�
    //2. ������ڲ�ֱ�Ӵ�������(�ö�����static)
    //3. �ṩһ��������static���������� gf����
    private GirlFriend(String name) {
        System.out.println("���������{��.");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;

    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
