package collecting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Dog("Ð¡»Æ", 10));
        arrayList.add(new Dog("´ó»Æ", 3));

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next" + next);

        }


        for (Object o : arrayList) {
            System.out.println("list" + o);

        }

    }
}

class Dog {
    private String name;
    private int age;

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
