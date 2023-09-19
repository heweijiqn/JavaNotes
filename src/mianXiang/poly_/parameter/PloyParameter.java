package mianXiang.poly_.parameter;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);

    }

    //showEmpAnnual(Employee e)
    //ʵ�ֻ�ȡ�κ�Ա��������깤��,����main�����е��ø÷��� [e.getAnnual()]
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());//��̬�󶨻���.
    }
    //���һ��������testWork,�������ͨԱ���������work����������Ǿ��������manage����
    public void testWork(Employee e) {
        if(e instanceof  Worker) {
            ((Worker) e).work();//������ת�Ͳ���
        } else if(e instanceof Manager) {
            ((Manager) e).manage();//������ת�Ͳ���
        } else {
            System.out.println("��������...");
        }
    }
}
