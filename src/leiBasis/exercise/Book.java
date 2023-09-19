package leiBasis.exercise;

public class Book {
    /*
编写类Book,  定义方法updatePrice，实现更改某本书的价格，
具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变

分析
1. 类名 Book
2. 属性 price, name
3. 方法名 updatePrice
4. 形参 ()
5. 返回值 void
6. 提供一个构造器
 */
    String name;
    double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        if (price>150){
            price = 150;

        } else if(price>100){
            price = 100;

        }else {
            System.out.println("这本书的价格为"+price);
        }
    }
    public void info() {
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }

    public static void main(String[] args) {

        //测试
        Book book = new Book("笑傲江湖",  300);
        book.info();
        book.updatePrice();//更新价格
        book.info();

    }


}
