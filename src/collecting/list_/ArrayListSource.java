package collecting.list_;

import java.util.ArrayList;



@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {
        //ע�⣬ע�⣬ע�⣬Idea Ĭ������£�Debug ��ʾ�������Ǽ򻯺�ģ����ϣ����������������
        //��Ҫ������.
        //ʹ���޲ι���������ArrayList����
        ArrayList list = new ArrayList();
//        ArrayList list = new ArrayList(8);
        //ʹ��for��list������� 1-10����
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //ʹ��for��list������� 11-15����
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

    }

}
