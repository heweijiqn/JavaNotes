package leiBasis.recrsion;

public class Mouse_1 {
    //使用递归回溯的思想来解决老鼠出迷宫

    //1. findWay 方法就是专门来找出迷宫的路径
    //2. 如果找到，就返回 true ,否则返回 false
    //3. map 就是二维数组，即表示迷宫
    //4. i,j 就是老鼠的位置，初始化的位置为(1,1)
    //5. 因为我们是递归的找路，所以我先规定 map 数组的各个值的含义
    // 0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
    //6. 当 map[6][5] =2 就说明找到通路,就可以结束，否则就继续找.
    // 7. 先确定老鼠找路策略上->右->下->左
    public boolean findWay2(int[][] map , int i, int j) {
        if (map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {//当前这个位置 0,说明表示可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //上->右->下->左
                if (findWay2(map, i - 1, j)) {//先走上
                    return true;
                } else if (findWay2(map, i, j + 1)) {//右
                    return true;
                } else if (findWay2(map, i + 1, j)) {//下
                    return true;
                } else if (findWay2(map, i, j - 1)) {//左
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
