package mianXiang.oop;

public class All {
    public static void main(String[] args) {
        //�����̬���飬���汣��2��ѧ����2����ʦ��Ҫ������Ӹߵ�������
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '��', 10, "0001");
        persons[1] = new Student("mary", 'Ů', 20, "0002");
        persons[2] = new Teacher("smith", '��', 36, 5);
        persons[3] = new Teacher("scott", '��', 26, 1);

        All news = new All();
        news.bubbleSort(persons);




        //�������������
        System.out.println("---����������-----");
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }



        System.out.println("=======================");
        for (int i = 0; i < persons.length; i++) {//������̬����
            news.test(persons[i]);
        }







    }

    public void test(Person p) {
        if(p instanceof Student) {//p ���������������Student
            ((Student) p).study();
        } else if(p instanceof  Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }

    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                //�ж�����, ע��������������Ը�����Ҫ���仯
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

}
