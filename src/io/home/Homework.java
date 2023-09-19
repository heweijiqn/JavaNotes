package io.home;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Homework {
    public static void main(String[] args) throws IOException {

        String filePath = "src\\dog.properties";
        FileReader fileReader = new FileReader(filePath);

        Properties properties = new Properties();
        properties.load(fileReader);
        String name = properties.getProperty("name");//获取name属性的值  为空则返回null
        int age = Integer.parseInt(properties.getProperty("age"));  // Object -> int
        String color = properties.getProperty("color"); //object -> string

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog对象信息====");
        System.out.println(dog);
        String serFilePath = "d:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();

    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "d:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();

        System.out.println("===反序列化后 dog====");
        System.out.println(dog);

        ois.close();

    }
}



class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
