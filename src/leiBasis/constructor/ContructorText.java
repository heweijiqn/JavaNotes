package leiBasis.constructor;

public class ContructorText {
    /**
     * ��ǰ�涨��� Person �����������������:
     * ��һ���޲ι����������ù��������������˵� age ���Գ�ʼֵ��Ϊ 18
     * �ڶ����� pName �� pAge ���������Ĺ�������
     * ʹ��ÿ�δ��� Person �����ͬʱ��ʼ������� age ����ֵ�� name ����ֵ��
     * �ֱ�ʹ�ò�ͬ�Ĺ���������������. */
    String name;//Ĭ��ֵ null
    int age;//Ĭ�� 0
    //��һ���޲ι����������ù��������������˵� age ���Գ�ʼֵ��Ϊ 18
    public ContructorText() {
        age = 18;//
    }
    public ContructorText(String pName, int pAge) {

        name = pName;
        age = pAge;
    }
}
