package mianXiang.poly_.arr;

public class Student extends Person{
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return "ѧ�� " + super.say() + " score=" + score;
    }

    public void study() {
        System.out.println("ѧ�� " + getName() + " ����ѧjava...");
    }
}
