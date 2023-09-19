package inner;

public class Exercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        //1. ���ݵ���ʵ���� Bell�ӿڵ������ڲ��� InnerClassExercise02$1
        //2. ��д�� ring
        //3. Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("��������");
        //            }
        //        }
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("��������");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("С����Ͽ���");
            }
        });
    }
}

interface Bell{ //�ӿ�
    void ring();//����
}
class CellPhone{//��
    public void alarmClock(Bell bell){//�β���Bell�ӿ�����
        System.out.println(bell.getClass());
        bell.ring();//��̬��
    }
}