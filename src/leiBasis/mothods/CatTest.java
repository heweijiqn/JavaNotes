package leiBasis.mothods;

public class CatTest {
    public static void main(String[] ages){
        //3. cat1 ����һ������
        Cat cat1 = new Cat();
        cat1.name = "С��";
        cat1.age = 3;
        cat1.color = "��ɫ";
        cat1.weight = 10;
        //�����˵ڶ�ֻè�������� cat2
        //cat2 Ҳ��һ������(è����)
        Cat cat2 = new Cat();
        cat2.name = "С��";
        cat2.age = 100;
        cat2.color = "��ɫ";
        cat2.weight = 20;
        //��ô���ʶ����������
        System.out.println("�� 1 ֻè��Ϣ" + cat1.name
                + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("�� 2 ֻè��Ϣ" + cat2.name
                + " " + cat2.age + " " + cat2.color + " " + cat2.weight);

    }

}
