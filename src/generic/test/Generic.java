package generic.test;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>();


        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));
        System.out.println("===使用原始的遍历====");
        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName()+dog.getAge());


        }
        System.out.println("===使用泛型====");
        for (Dog o : arrayList) {
            System.out.println(o.getName()+o.getAge());

        }


    }
}

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat类
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
