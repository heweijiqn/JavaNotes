package intreface_.enter.poly;

public class Pass {//��̬��������


    public static void main(String[] args) {
        //�ӿ����͵ı�������ָ��ʵ���˸ýӿڵ���Ķ���ʵ��
        IG ig = new Teacher();
        //���IG �̳��� IH �ӿڣ���Teacher ��ʵ���� IG�ӿ�
        //��ô��ʵ���Ͼ��൱�� Teacher ��Ҳʵ���� IH�ӿ�.
        //�������ν�� �ӿڶ�̬��������.
        IH ih = new Teacher();
    }



}

interface IH {
    void hi();
}
interface IG extends IH{

}
class Teacher implements IG {
    @Override
    public void hi() {
    }
}