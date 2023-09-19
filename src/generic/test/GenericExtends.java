package generic.test;

import java.util.ArrayList;
import java.util.List;
  @SuppressWarnings({"all"})
public class GenericExtends {
    public static void main(String[] args) {

        Object o = new String("xx");

        //����û�м̳���
        //List<Object> list = new ArrayList<String>();

        //����˵����������������ʹ��
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        //����� List<?> c �����Խ�������ķ�������
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c�� ��ʾ ���ޣ����Խ��� AA����AA����
//        printCollection2(list1);//��
//        printCollection2(list2);//��
        printCollection2(list3);//��
        printCollection2(list4);//��
        printCollection2(list5);//��

        //List<? super AA> c: ֧��AA���Լ�AA��ĸ��࣬������ֱ�Ӹ���
        printCollection3(list1);//��
        //printCollection3(list2);//��
        printCollection3(list3);//��
        //printCollection3(list4);//��
        //printCollection3(list5);//��


        //ð������

        //��������

        //....


    }
    // ? extends AA ��ʾ ���ޣ����Խ��� AA����AA����
    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //˵��: List<?> ��ʾ ����ķ������Ͷ����Խ���
    public static void printCollection1(List<?> c) {
        for (Object object : c) { // ͨ�����ȡ��ʱ������Object
            System.out.println(object);
        }
    }



    // ? super ��������AA:֧��AA���Լ�AA��ĸ��࣬������ֱ�Ӹ��࣬
    //�涨�˷��͵�����
    public static void printCollection3(List<? super AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}



