package work;

public class End {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //�Ƚ�һ��
        //switch () �У�����ö�ٶ���
        //��ÿ��case ��ֱ��д����ö�����У������ö�ٶ��󼴿�
        switch (green) {
            case YELLOW:
                System.out.println("ƥ�䵽��ɫ");
                break;
            case BLACK:
                System.out.println("ƥ�䵽��ɫ");
                break;
            default:
                System.out.println("û��ƥ�䵽..");
        }

    }
}

interface IMyInterface {
    public void show();
}

enum Color implements IMyInterface {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("����ֵΪ" + redValue + "," + greenValue + "," + blueValue);
    }
}
