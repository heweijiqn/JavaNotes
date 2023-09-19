package mianXiang.oop;

public class Teacher extends Person{
    private int work_age;
    //����

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

    //��ʦ��Ҫ�н�ѧ�ķ�����teach�����ڷ�����д�ϡ��ҳ�ŵ���һ������ѧ��
    public void teach() {
        System.out.println(getName() + "��ŵ���һ������ѧ java...");
    }
    /**
     * ��ʦ��������
     */
    @Override
    public String play() {
        return super.play() + "����";
    }
    //�����Ϣ����
    public void printInfo() {
        System.out.println("��ʦ����Ϣ��");
        System.out.println(super.basicInfo());
        System.out.println("����: " + work_age);
        teach();
        System.out.println(play());
    }

    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }



}
