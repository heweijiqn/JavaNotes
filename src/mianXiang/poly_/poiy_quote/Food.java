package mianXiang.poly_.poiy_quote;

public class Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }
}
class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}
class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}
class Rice extends Food {
    public Rice(String name) {
        super(name);
    }
}
