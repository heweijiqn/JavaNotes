package collecting.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedTest {
    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("����", 1000));//OK
        linkedHashSet.add(new Car("�µ�", 300000));//OK
        linkedHashSet.add(new Car("������", 10000000));//OK
        linkedHashSet.add(new Car("�µ�", 300000));//���벻��
        linkedHashSet.add(new Car("��ʱ��", 70000000));//OK
        linkedHashSet.add(new Car("�µ�", 300000));//���벻��

        System.out.println("linkedHashSet=" + linkedHashSet);

    }
}

/**
 * Car ��(����:name,price)��  ��� name �� price һ����
 * ����Ϊ����ͬԪ�أ��Ͳ�����ӡ� 5min
 */

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //��дequals ���� �� hashCode
    //�� name �� price ��ͬʱ�� �ͷ�����ͬ�� hashCode ֵ, equals����t

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

