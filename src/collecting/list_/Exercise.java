package collecting.list_;



import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"all"})
public class Exercise {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new ArrayList();
        //List list = new Vector();
        list.add(new Book1("��¥��", "��ѩ��", 100));
        list.add(new Book1("���μ�", "��ж�", 10));
        list.add(new Book1("ˮ䰴�", "ʩ����", 19));
        list.add(new Book1("����", "�޹���", 80));



        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);

        System.out.println("==�����==");

        for (Object o : list) {
            System.out.println(o);
        }


    }



    //�۸�Ҫ���Ǵ�С����
    public static void sort(List list) {

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                //ȡ������Book ����ת��
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//����
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }

    }
}



class Book1 {
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "���ƣ�" + name + "\t\t�۸�:" + price + "\t\t���ߣ�" + author;
    }
}




