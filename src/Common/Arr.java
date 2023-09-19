package Common;

import java.util.Arrays;
import java.util.Comparator;

public class Arr {
    public static void main(String[] args) {
         /*
        �������Զ���Book�࣬�������name��price����price����(�Ӵ�С)��
        Ҫ��ʹ�����ַ�ʽ���� , ��һ�� Book[] books = 4�������.

        ʹ��ǰ��ѧϰ���Ĵ��� ʵ��Comparator�ӿ������ڲ��࣬Ҳ��Ϊ��������

        ���԰��� price (1)�Ӵ�С (2)��С���� (3) �����������ȴӴ�С

         */

        Book[] books = new Book[4];
        books[0] = new Book("��¥��", 100);
        books[1] = new Book("��ƿ÷��", 90);
        books[2] = new Book("������ժ20��", 5);
        books[3] = new Book("java�����ŵ�����~", 300);

        //(1)price�Ӵ�С


        Arrays.sort(books, new Comparator() {
            //�����Ƕ�Book�����������  o1 �� o2 ����Book����
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                //������ʦ������һ��ת��
                //������ַ��ؽ������������Ĳ�һ�£����޸�һ�·��ص� 1 �� -1
                if(priceVal > 0) {
                    return  1;
                } else  if(priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //(2)price��С����
        /**** Arrays.sort(books, new Comparator() {
         //�����Ƕ�Book�����������  o1 �� o2 ����Book����
         @Override
         public int compare(Object o1, Object o2) {
         Book book1 = (Book) o1;
         Book book2 = (Book) o2;
         double priceVal = book2.getPrice() - book1.getPrice();
         //������ʦ������һ��ת��
         //������ַ��ؽ������������Ĳ�һ�£����޸�һ�·��ص� 1 �� -1
         if(priceVal > 0) {
         return  -1;
         } else  if(priceVal < 0) {
         return 1;
         } else {
         return 0;
         }
         }
         });***/

        //(3)�����������ȴӴ�С

       /**** Arrays.sort(books, new Comparator() {
            //�����Ƕ�Book�����������  o1 �� o2 ����Book����
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                //Ҫ���������ĳ�������������
                return book2.getName().length() - book1.getName().length();
            }
        });***/


        System.out.println(Arrays.toString(books));

    }

}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", price=" + price +
                '}';
    }
}