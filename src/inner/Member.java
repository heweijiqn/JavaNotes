package inner;

public class Member {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();


        // ��һ�ַ�ʽ
        // outer08.new Inner08(); �൱�ڰ� new Inner08()������outer08��Ա
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        // �ڶ���ʽ ���ⲿ���У���дһ�����������Է��� Inner08����
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}

class Outer08 { //�ⲿ��
    private int n1 = 10;
    public String name = "����";
    private void hi() {
        System.out.println("hi()����...");
    }


    //1.ע��: ��Ա�ڲ��࣬�Ƕ������ⲿ�ڵĳ�Աλ����
    //2.�����������������η�(public��protected ��Ĭ�ϡ�private),��Ϊ���ĵ�λ����һ����Ա
    public class Inner08 {//��Ա�ڲ���
        private double sal = 99.8;
        private int n1 = 66;
        public  void say() {
            //����ֱ�ӷ����ⲿ������г�Ա������˽�е�
            //�����Ա�ڲ���ĳ�Ա���ⲿ��ĳ�Ա�����������ؾͽ�ԭ��.
            //������ͨ��  �ⲿ����.this.���� �������ⲿ��ĳ�Ա
            System.out.println("n1 = " + n1 + " name = " + name + " �ⲿ���n1=" + Outer08.this.n1);
            hi();
        }

    }


    //����������һ��Inner08ʵ��
    public Inner08 getInner08Instance(){
        return new Inner08();
    }


    //д����
    public void t1() {
        //ʹ�ó�Ա�ڲ���
        //������Ա�ڲ���Ķ���Ȼ��ʹ����صķ���
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}

