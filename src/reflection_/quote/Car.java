/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 16:46
 */


package reflection_.quote;

public class Car {
    public String brand = "����";//Ʒ��
    public int price = 500000;
    public String color = "��ɫ";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
