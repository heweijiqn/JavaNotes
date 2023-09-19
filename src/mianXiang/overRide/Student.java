package mianXiang.overRide;

public class Student extends Person{
    private int id;
    private double score;

    @Override
    public String say() {
        return super.say()+" id=" + id + " score=" + score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
}
