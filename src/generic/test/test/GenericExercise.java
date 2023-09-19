package generic.test.test;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(1980,12,11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001,12,12)));
        employees.add(new Employee("tom", 50000, new MyDate(1980,12,10)));

        System.out.println("employees=" + employees);


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //�Ȱ���name�������name��ͬ�����������ڵ��Ⱥ����򡣡�������������
                //�ȶԴ���Ĳ���������֤
                if(!(emp1 instanceof  Employee && emp2 instanceof Employee)) {
                    System.out.println("���Ͳ���ȷ..");
                    return 0;
                }
                //�Ƚ�name
                int i = emp1.getName().compareTo(emp2.getName());
                if(i != 0) {
                    return i;
                }

                //�����Ƕ�birthday�ıȽϣ���ˣ�������ð�����Ƚϣ�����MyDate�����
                //��װ�󣬽�����ά���Ժ͸����ԣ��ʹ����ǿ.
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });


        System.out.println("==�Թ�Ա��������==");
        System.out.println(employees);

    }
}
