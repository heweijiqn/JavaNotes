package abstract_;

public class Dynamic {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.calculateTime(); //这里还是需要有良好的OOP基础，对多态

        BB bb = new BB();
        bb.calculateTime();
    }

}

class AA extends Template {

    //计算任务
    //1+....+ 800000
    @Override
    public void job() { //实现Template的抽象方法job

        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num += i;
        }
    }

}


class BB extends Template{

    public void job() {//这里也去，重写了Template的job方法

        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num *= i;
        }

    }
}