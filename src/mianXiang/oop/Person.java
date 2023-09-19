package mianXiang.oop;

public class Person {
    private String name;
    private char gender;
    private int age;
    //����

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //��дһ��play ����, �ѹ��е��������д������
    public String play() {
        return name + "����";
    }
    //����һ��������Ϣ
    /*
    �������ŷ�
    ���䣺30
    �Ա���
     */
    public String basicInfo() {
        return "����: " + name + "\n����: " + age + "\n�Ա�: " + gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
