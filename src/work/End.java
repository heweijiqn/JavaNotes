package work;

public class End {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //比较一下
        //switch () 中，放入枚举对象
        //在每个case 后，直接写上在枚举类中，定义的枚举对象即可
        switch (green) {
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("没有匹配到..");
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
        System.out.println("属性值为" + redValue + "," + greenValue + "," + blueValue);
    }
}
