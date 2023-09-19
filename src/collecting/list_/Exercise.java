package collecting.list_;



import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"all"})
public class Exercise {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new ArrayList();
        //List list = new Vector();
        list.add(new Book1("红楼梦", "曹雪芹", 100));
        list.add(new Book1("西游记", "吴承恩", 10));
        list.add(new Book1("水浒传", "施耐庵", 19));
        list.add(new Book1("三国", "罗贯中", 80));



        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);

        System.out.println("==排序后==");

        for (Object o : list) {
            System.out.println(o);
        }


    }



    //价格要求是从小到大
    public static void sort(List list) {

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出对象Book 向下转型
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
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
        return "名称：" + name + "\t\t价格:" + price + "\t\t作者：" + author;
    }
}




