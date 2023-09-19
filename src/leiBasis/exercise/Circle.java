package leiBasis.exercise;

public class Circle {
    double radius;

    public Circle() { //无参构造器

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {//返回面积
        return Math.PI * radius * radius;
    }
    //添加方法setRadius, 修改对象的半径值
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printAreas(Circle c, int times) {
        System.out.println("radius\tarea");
        for(int i = 1; i <= times; i++) {//输出1到times之间的每个整数半径值
            c.setRadius(i) ; //修改c 对象的半径值
            System.out.println((double)i + "\t" + c.findArea());
        }
    }

    public double area() { //面积 Math.PI是派
        return Math.PI * radius * radius;
    }


    public double len() { //周长
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("面积=" + circle.area());
        System.out.println("周长=" + circle.len());
        System.out.println("----------");

        Circle c = new Circle();
        circle.printAreas( c,5);
    }

}
