package work.com;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //ʵ����Person������ɮ����Ҫ��һ���������Horse��Ϊ��ͨ���ߣ��������ʱ��Boat��Ϊ��ͨ���ߣ�����ɽ���ɻ�
    //�����漰��һ�����˼·�����ǿ��԰Ѿ����Ҫ�󣬷�װ�ɷ���-> ������Ǳ��˼��

    public void passRiver() {

        //vehicles instanceof Boat ���ж� ��ǰ�� vehicles�ǲ���Boat
        //(1) vehicles = null  : vehicles instanceof Boat  => false
        //(2) vehicles = ����� ��vehicles instanceof Boat  => false
        //(3) vehicles = ������ ��vehicles instanceof Boat  => true
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //�õ����
        //�ж�һ�£���ǰ�� vehicles ������null, �ͻ�ȡһƥ��
        //if (vehicles == null) {
        if (!(vehicles instanceof Horse)) {
            //����ʹ�õ��Ƕ�̬������ת��
            vehicles = VehiclesFactory.getHorse();
        }
        //��������ʹ�ýӿڵ���
        vehicles.work();
    }
    //������ɽ
    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            //����ʹ�õ��Ƕ�̬
            vehicles = VehiclesFactory.getPlane();
        }
        //��������ʹ�ýӿڵ���
        vehicles.work();

    }
}

//��Person�࣬��name��Vehicles���ԣ��ڹ�������Ϊ�������Ը�ֵ

