package annotations;

public class Override_ {
    public static void main(String[] args) {

    }
}

class Father{//����

    public void fly(){
        int i = 0;
        System.out.println("Father fly...");
    }
    public void say(){}

}

class Son extends Father {//����


    //1. @Override ע�����fly�����ϣ���ʾ�����fly����ʱ��д�˸����fly
    //2. �������û��д @Override ������д�˸���fly
    //3. �����д��@Overrideע�⣬�������ͻ�ȥ���÷����Ƿ������д�˸����
    //   �����������ȷ��д�ˣ������ͨ�������û�й�����д����������
    //4. ���� @Override�Ķ���
    //   ����� ������� @interface ��ʾһ�� ע����
    /**
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     */
    @Override   //˵��
    public void fly() {
        System.out.println("Son fly....");
    }
    @Override
    public void say() {}
}

