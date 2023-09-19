package collecting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {
        List col = new ArrayList();
//        Collection col = new ArrayList();

        col.add(new Book("��������", "�޹���", 10.1));
        col.add(new Book("С��ɵ�", "����", 5.1));
        col.add(new Book("��¥��", "��ѩ��", 34.6));


        //System.out.println("col=" + col);
        //����ϣ���ܹ����� col����
        //1. �ȵõ� col ��Ӧ�� ������
        Iterator iterator = col.iterator();
        //2. ʹ��whileѭ������
//        while (iterator.hasNext()) {//�ж��Ƿ�������
//            //������һ��Ԫ�أ�������Object
//            Object obj = iterator.next();
//            System.out.println("obj=" + obj);
//        }
        //�������� while => itit
        //��ʾ���еĿ�ݼ��ĵĿ�ݼ� ctrl + j
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);

        }
        //3. ���˳�whileѭ���� , ��ʱiterator��������ָ������Ԫ��
        //   iterator.next();//NoSuchElementException �쳣
        //4. ���ϣ���ٴα�������Ҫ�������ǵĵ�����
        iterator = col.iterator();
        System.out.println("===�ڶ��α���===");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);

        }

        //1. ʹ����ǿfor, ��Collection����
        //2. ��ǿfor�� �ײ���Ȼ�ǵ�����
        //3. ��ǿfor�������ɾ��Ǽ򻯰汾�� ����������
        //4. ��ݼ���ʽ I
//        for (Object book : col) {
//            System.out.println("book=" + book);
//        }
        for (Object o : col) {
            System.out.println("book=" + o);
        }

        for (int i = 0; i < col.size(); i++) {
            System.out.println("��"+col.get(i));

        }



        //��ǿfor��Ҳ����ֱ��������ʹ��
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }


    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}



