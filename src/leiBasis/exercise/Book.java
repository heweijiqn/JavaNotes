package leiBasis.exercise;

public class Book {
    /*
��д��Book,  ���巽��updatePrice��ʵ�ָ���ĳ����ļ۸�
���壺����۸�>150,�����Ϊ150������۸�>100,����Ϊ100�����򲻱�

����
1. ���� Book
2. ���� price, name
3. ������ updatePrice
4. �β� ()
5. ����ֵ void
6. �ṩһ��������
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
            System.out.println("�Ȿ��ļ۸�Ϊ"+price);
        }
    }
    public void info() {
        System.out.println("����=" + this.name + " �۸�=" + this.price);
    }

    public static void main(String[] args) {

        //����
        Book book = new Book("Ц������",  300);
        book.info();
        book.updatePrice();//���¼۸�
        book.info();

    }


}
