package mianXiang.poly_.binding;

public class Binding {
    public static void main(String[] args) {
        //a �ı������� A, �������� B
        C a = new D();//����ת��
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }

}
class C {//����
    public int i = 10;
    //��̬�󶨻���:

    public int sum() {//����sum()
        return getI() + 10;//20 + 10
    }

    public int sum1() {//����sum1()
        return i + 10;//10 + 10
    }

    public int getI() {//����getI
        return i;
    }
}

class D extends C {//����
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {//����getI()
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
