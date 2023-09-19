package mianXiang;

public class ToString {
    public static void main(String[] args) {

        /*
        Object��toString() Դ��
        (1)getClass().getName() ���ȫ����(����+���� )
        (2)Integer.toHexString(hashCode()) �������hashCodeֵת��16�����ַ���
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        Monster monster = new Monster("С����", "Ѳɽ��", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

        System.out.println("==��ֱ�����һ������ʱ��toString �����ᱻĬ�ϵĵ���==");
        System.out.println(monster); //�ȼ� monster.toString()



    }

}
class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //��дtoString����, ������������
    //ʹ�ÿ�ݼ����� alt+insert -> toString
    @Override
    public String toString() { //��д��һ���ǰѶ��������ֵ�������Ȼ����ԱҲ�����Լ�����
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("fin..");
    }
}
