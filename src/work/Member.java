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

    //Air 成员内部类
    class Air {
        public void flow() {
            if(temperature > 40) {
                System.out.println("温度大于40 空调吹冷气..");
            } else if(temperature < 0) {
                System.out.println("温度小于0 空调吹暖气..");
            } else {
                System.out.println("温度正常，关闭空调..");
            }
        }
    }
    //返回一个Air对象
    public Air getAir() {
        return new Air();
    }
}
