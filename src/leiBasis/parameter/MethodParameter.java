package leiBasis.parameter;

public class MethodParameter {
    //MethodParameter ���б�дһ������ test
    //���Խ���һ�����飬�ڷ������޸ĸ����飬����ԭ���������Ƿ�仯
/*
���鴫�ݵ��ǵ�ַ���൱��һ������
�������ʹ��ݵ��ǵ�ַ������Ҳ��ֵ������ֵ�ǵ�ַ��������ͨ���β�Ӱ��ʵ��*/
    public void test(int[] arr) {
        arr[0] = 200;//�޸�Ԫ��
        //��������
        System.out.println(" test �� arr ���� ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
