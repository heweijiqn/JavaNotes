package Common;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {

        //exit �˳���ǰ����

        /***System.out.println("ok1");

        //1. exit(0) ��ʾ�����˳�
        //2. 0 ��ʾһ��״̬ , ������״̬
        System.exit(0);//
        System.out.println("ok2");***/

        //arraycopy ����������Ԫ�أ��Ƚ��ʺϵײ���ã�
        // һ��ʹ��Arrays.copyOf��ɸ�������

        int[] src={1,2,3};
        int[] dest = new int[3];// dest ��ǰ�� {0,0,0}

        //1. ��Ҫ�Ǹ��������������ĺ���
        //2.
        //     Դ����
        //     * @param      src      the source array.
        //     srcPos�� ��Դ������ĸ�����λ�ÿ�ʼ����
        //     * @param      srcPos   starting position in the source array.
        //     dest : Ŀ�����飬����Դ��������ݿ������ĸ�����
        //     * @param      dest     the destination array.
        //     destPos: ��Դ��������ݿ����� Ŀ��������ĸ�����
        //     * @param      destPos  starting position in the destination data.
        //     length: ��Դ���鿽�����ٸ����ݵ�Ŀ������
        //     * @param      length   the number of array elements to be copied.
        System.arraycopy(src, 0, dest, 0, src.length);
        // int[] src={1,2,3};
        System.out.println("dest=" + Arrays.toString(dest));//[1, 2, 3]

        //currentTimeMillens:���ص�ǰʱ�����1970-1-1 �ĺ�����
        // �Ϻ����:
        System.out.println(System.currentTimeMillis());


    }
}
