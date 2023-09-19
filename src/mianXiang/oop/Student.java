package mianXiang.oop;

public class Student extends Person {
    private String stu_id;
    //����
    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    //�ҳ�ŵ���һ�ú�ѧϰ
    public void study() {
        System.out.println(getName() + "��ŵ���һ�ú�ѧϰ  java");
    }

    /**
     * ѧ����������
     * @return
     */
    @Override
    public String play() {
        return super.play() + "����";
    }

    //��дһ�������Ϣ�ķ������������ַ�װ
    public void printInfo() {
        System.out.println("ѧ������Ϣ:");
        System.out.println(super.basicInfo());
        System.out.println("ѧ��: " + stu_id);
        study();//��ϣ� �仯��ǧ
        System.out.println(play());
    }
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }

}
