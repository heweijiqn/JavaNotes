package mianXiang.Extends;

public class Student {
    //��������
    public String name;
    public int age;
    private double score;//�ɼ�
    //���еķ���
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("ѧ���� " + name + " ���� " + age + " �ɼ� " + score);
    }
}
