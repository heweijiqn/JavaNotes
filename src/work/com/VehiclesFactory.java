package work.com;

public class VehiclesFactory {


    //���ʼ����ͬһƥ
    private static Horse horse = new Horse(); //����ʽ

    private VehiclesFactory(){}
    //������ͨ���߹����࣬�����������ֱ��ý�ͨ����Horse��Boat
    //������ǽ���������static
    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}


