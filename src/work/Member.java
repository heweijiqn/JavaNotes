package work;

public class Member {
    public static void main(String[] args) {
        Car2 car2 =new Car2(55);
        car2.getAir().flow();
    }
}

class Car2 {

    private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    //Air ��Ա�ڲ���
    class Air {
        public void flow() {
            if(temperature > 40) {
                System.out.println("�¶ȴ���40 �յ�������..");
            } else if(temperature < 0) {
                System.out.println("�¶�С��0 �յ���ů��..");
            } else {
                System.out.println("�¶��������رտյ�..");
            }
        }
    }
    //����һ��Air����
    public Air getAir() {
        return new Air();
    }
}
