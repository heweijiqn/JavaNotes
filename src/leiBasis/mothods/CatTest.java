package leiBasis.mothods;

public class CatTest {
    public static void main(String[] ages){
        //3. cat1 就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 10;
        //创建了第二只猫，并赋给 cat2
        //cat2 也是一个对象(猫对象)
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        cat2.weight = 20;
        //怎么访问对象的属性呢
        System.out.println("第 1 只猫信息" + cat1.name
                + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("第 2 只猫信息" + cat2.name
                + " " + cat2.age + " " + cat2.color + " " + cat2.weight);

    }

}
