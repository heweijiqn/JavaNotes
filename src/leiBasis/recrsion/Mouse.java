package leiBasis.recrsion;

public class Mouse {
    public static void main(String[] ages){
        //˼·
        //1. �ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
        //2. �ȹ涨 map �����Ԫ��ֵ: 0 ��ʾ������ 1 ��ʾ�ϰ���
        int[][] map = new int[8][7];

        //3. ���������һ�к��������һ�У�ȫ������Ϊ 1
        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //4.���������һ�к��������һ�У�ȫ������Ϊ 1
        for(int i = 0; i<8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;


        //�����ǰ�ĵ�ͼ
        System.out.println("=====��ǰ��ͼ���======");
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//���һ��
            }
            System.out.println();
        }
        Mouse_1 k = new Mouse_1();
        k.findWay2(map,1,1);
        System.out.println("\n====��·���������=====");
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//���һ��
            }
            System.out.println();
        }

    }
}
