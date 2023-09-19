package mianXiang.oop;

public class Teacher extends Person{
    private int work_age;
    //方法

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }


    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    //教师需要有教学的方法（teach），在方法里写上“我承诺，我会认真教学。
    public void teach() {
        System.out.println(getName() + "承诺，我会认真教学 java...");
    }
    /**
     * 老师爱玩象棋
     */
    @Override
    public String play() {
        return super.play() + "象棋";
    }
    //输出信息方法
    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + work_age);
        teach();
        System.out.println(play());
    }

    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }



}
