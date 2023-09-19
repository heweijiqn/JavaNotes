package leiBasis.exercise;

public class Circle {
    double radius;

    public Circle() { //�޲ι�����

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {//�������
        return Math.PI * radius * radius;
    }
    //��ӷ���setRadius, �޸Ķ���İ뾶ֵ
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printAreas(Circle c, int times) {
        System.out.println("radius\tarea");
        for(int i = 1; i <= times; i++) {//���1��times֮���ÿ�������뾶ֵ
            c.setRadius(i) ; //�޸�c ����İ뾶ֵ
            System.out.println((double)i + "\t" + c.findArea());
        }
    }

    public double area() { //��� Math.PI����
        return Math.PI * radius * radius;
    }


    public double len() { //�ܳ�
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("���=" + circle.area());
        System.out.println("�ܳ�=" + circle.len());
        System.out.println("----------");

        Circle c = new Circle();
        circle.printAreas( c,5);
    }

}
