package mianXiang.poly_.arr;

public class ShuZhu {
    public static void main(String[] args) {
        //Ӧ��ʵ��:����һ���̳нṹ���£�Ҫ�󴴽�1��Person����
        // 2��Student �����2��Teacher����, ͳһ���������У�������ÿ������say����

        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        //ѭ��������̬���飬����say
        for (int i = 0; i < persons.length; i++) {
            //��ʦ��ʾ: person[i] ���������� Person ,�����������Ǹ���ʵ�������JVM���ж�
            System.out.println(persons[i].say());//��̬�󶨻���
            //�����Ҵ���. ʹ�� �����ж� + ����ת��.
            if(persons[i]  instanceof  Student) {//�ж�person[i] �����������ǲ���Student
                Student student = (Student)persons[i];//����ת��
                student.study();
                //С���Ҳ����ʹ��һ����� ((Student)persons[i]).study();
            } else if(persons[i] instanceof  Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else if(persons[i] instanceof  Person){
                //System.out.println("�����������, ���Լ����...");
            } else {
                System.out.println("�����������, ���Լ����...");
            }

        }

    }

}
