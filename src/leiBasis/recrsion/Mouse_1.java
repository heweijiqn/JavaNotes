package leiBasis.recrsion;

public class Mouse_1 {
    //ʹ�õݹ���ݵ�˼�������������Թ�

    //1. findWay ��������ר�����ҳ��Թ���·��
    //2. ����ҵ����ͷ��� true ,���򷵻� false
    //3. map ���Ƕ�ά���飬����ʾ�Թ�
    //4. i,j ���������λ�ã���ʼ����λ��Ϊ(1,1)
    //5. ��Ϊ�����ǵݹ����·���������ȹ涨 map ����ĸ���ֵ�ĺ���
    // 0 ��ʾ������ 1 ��ʾ�ϰ��� 2 ��ʾ������ 3 ��ʾ�߹��������߲�ͨ����·
    //6. �� map[6][5] =2 ��˵���ҵ�ͨ·,�Ϳ��Խ���������ͼ�����.
    // 7. ��ȷ��������·������->��->��->��
    public boolean findWay2(int[][] map , int i, int j) {
        if (map[6][5] == 2) {//˵���Ѿ��ҵ�
            return true;
        } else {
            if (map[i][j] == 0) {//��ǰ���λ�� 0,˵����ʾ������
                //���Ǽٶ�������ͨ
                map[i][j] = 2;
                //ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
                //��->��->��->��
                if (findWay2(map, i - 1, j)) {//������
                    return true;
                } else if (findWay2(map, i, j + 1)) {//��
                    return true;
                } else if (findWay2(map, i + 1, j)) {//��
                    return true;
                } else if (findWay2(map, i, j - 1)) {//��
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else { //map[i][j] = 1 , 2 , 3
                return false;
            }
        }
    }
}
