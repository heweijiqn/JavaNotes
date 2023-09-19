package mianXiang.equal;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '��');
        Person person2 = new Person("jack", 10, '��');

        System.out.println(person1.equals(person2));//�� ��Ϊ��д��equals ��ʵ����equals�жϵ������õ�ַ
    }

}
class Person{ //extends Object
    private String name;
    private int age;
    private char gender;

    //��дObject �� equals����
    public boolean equals(Object obj) {
        //�ж�����Ƚϵ�����������ͬһ��������ֱ�ӷ���true
        if(this == obj) {
            return true;
        }
        //�����ж�
        if(obj instanceof  Person) {//��Person�����ǲűȽ�

            //���� ����ת��, ��Ϊ����Ҫ�õ�obj�� ��������
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //�������Person ����ֱ�ӷ���false
        return false;

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
