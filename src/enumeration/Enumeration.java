package enumeration;

public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}

//��ʾ�ֶ���ö��ʵ��
class Season {//��
    private String name;
    private String desc;//����

    //�������ĸ�����, �̶�.
    public static final Season SPRING = new Season("����", "��ů");
    public static final Season WINTER = new Season("����", "����");
    public static final Season AUTUMN = new Season("����", "��ˬ");
    public static final Season SUMMER = new Season("����", "����");


    //1. ��������˽�л�,Ŀ�ķ�ֹ ֱ�� new
    //2. ȥ��setXxx����, ��ֹ���Ա��޸�
    //3. ��Season �ڲ���ֱ�Ӵ����̶��Ķ���
    //4. �Ż������Լ��� final ���η�
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}