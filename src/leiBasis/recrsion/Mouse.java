package leiBasis.recrsion;

public class Mouse {
    public static void main(String[] ages){
        //思路
        //1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
        //2. 先规定 map 数组的元素值: 0 表示可以走 1 表示障碍物
        int[][] map = new int[8][7];

        //3. 将最上面的一行和最下面的一行，全部设置为 1
        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //4.将最右面的一列和最左面的一列，全部设置为 1
        for(int i = 0; i<8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;


        //输出当前的地图
        System.out.println("=====当前地图情况======");
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }
        Mouse_1 k = new Mouse_1();
        k.findWay2(map,1,1);
        System.out.println("\n====找路的情况如下=====");
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }

    }
}
