/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/5 15:48
 */


package reflection_.quote;

public class Cat {
    private String name = "�в�è";
    public int age = 10; //public��

    public Cat() {} //�޲ι�����

    public Cat(String name) {
        this.name = name;
    }

    public void hi() { //���÷���
        //System.out.println("hi " + name);
    }
    public void cry() { //���÷���
        System.out.println(name + " ������..");
    }
}
