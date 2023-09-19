package mianXiang.poly_.poiy_quote;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
}
class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }
}