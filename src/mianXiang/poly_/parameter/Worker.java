package mianXiang.poly_.parameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("��ͨԱ�� " + getName() + " is working");
    }

    @Override
    public double getAnnual() { //��Ϊ��ͨԱ��û���������룬��ֱ�ӵ��ø��෽��
        return super.getAnnual();
    }
}
