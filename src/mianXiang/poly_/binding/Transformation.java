package mianXiang.poly_.binding;

public class Transformation {
    public static void main(String[] args) {
        //����ת��: ���������ָ��������Ķ���
        //�﷨���������������� = new ��������();

        Zoo animal = new BigCat();
        Object obj = new BigCat();//������? ���� Object Ҳ�� Cat �ĸ���

        //����ת�͵��÷����Ĺ�������:
        //(1)���Ե��ø����е����г�Ա(�����ط���Ȩ��)
        //(2)���ǲ��ܵ�����������еĳ�Ա
        //(#)��Ϊ�ڱ���׶Σ��ܵ�����Щ��Ա,���ɱ���������������
        //animal.catchMouse();����
        //(4)��������Ч��������(��������)�ľ���ʵ��, �����÷���ʱ�����մ�����(��������)��ʼ���ҷ���
        //��Ȼ����ã�������ǰ�����ǽ��ķ������ù���һ�¡�
        animal.eat();//è����.. animal.run();//��
        animal.show();//hello,���
        animal.sleep();//˯


        //��̬������ת��
        //(1)�﷨���������� ������ =���������ͣ���������;
        //cat �ı������� Cat,���������� Cat
        BigCat cat = (BigCat) animal;
        cat.catchMouse();//èץ����
        cat.run();//��
        //(2)Ҫ��������ñ���ָ����ǵ�ǰĿ�����͵Ķ���



        //����û����д֮˵�����Ե�ֵ����������
        // instanceOf �Ƚϲ������������ж϶�������������Ƿ�Ϊ XX ���ͻ� XX ���͵�������  ����

    }
}
class Zoo {
    String name = "����";
    int age = 10;
    public void sleep(){
        System.out.println("˯");
    }
    public void run(){
        System.out.println("��");
    }
    public void eat(){
        System.out.println("��");
    }
    public void show(){
        System.out.println("hello,���");
    }

}
class BigCat extends Zoo{
    public void eat(){//������д
        System.out.println("è����");
    }
    public void catchMouse(){//Cat���з���
        System.out.println("èץ����");
    }
}
class BigDog extends  Zoo{

}

