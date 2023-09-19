package intreface_.enter.extends_;

public class Extends {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("���");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}
//����
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing() {
        System.out.println(name + " ������...");
    }

    public String getName() {
        return name;
    }
}

//�ӿ�
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}

//�̳�
//С��:  ������̳��˸��࣬���Զ���ӵ�и���Ĺ���
//      ���������Ҫ��չ���ܣ�����ͨ��ʵ�ֽӿڵķ�ʽ��չ.
//      ������� ʵ�ֽӿ� �� ��java ���̳л��Ƶ�һ�ֲ���.
class LittleMonkey extends Monkey implements Fishable,Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " ͨ��ѧϰ�����������һ����Ӿ...");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " ͨ��ѧϰ�����������һ������...");
    }
}
