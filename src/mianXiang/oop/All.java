package mianXiang.oop;

public class All {
    public static void main(String[] args) {
        //定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("mary", '女', 20, "0002");
        persons[2] = new Teacher("smith", '男', 36, 5);
        persons[3] = new Teacher("scott", '男', 26, 1);

        All news = new All();
        news.bubbleSort(persons);




        //输出排序后的数组
        System.out.println("---排序后的数组-----");
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }



        System.out.println("=======================");
        for (int i = 0; i < persons.length; i++) {//遍历多态数组
            news.test(persons[i]);
        }







    }

    public void test(Person p) {
        if(p instanceof Student) {//p 的运行类型如果是Student
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
                //判断条件, 注意这里的条件可以根据需要，变化
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

}
