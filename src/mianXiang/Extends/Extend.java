package mianXiang.Extends;

public class Extend {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "���Ǵ���~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("___________");
        Graduate graduate =new Graduate();
        graduate.name = "��Ǵ���~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
