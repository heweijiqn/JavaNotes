package leiBasis.recrsion;

public class HangNuoTang {
    //方法
    //num 表示要移动的个数, a, b, c 分别表示 A 塔，B 塔 ,C塔
    public void move(int num , char a, char b, char c){//a要借助b将所有移动到c
        if(num == 1) {
            System.out.println(a + "->" + c);
        } else {
        //如果有多个盘，可以看成两个 , 最下面的和上面的所有盘(num-1)
        //(1)先移动上面所有的盘到 b, 借助 c
            move(num - 1 , a, c, b);
        //(2)把最下面的这个盘，移动到 c
            System.out.println(a + "->" + c);
        //(3)再把 b 塔的所有盘，移动到 c ,借助 a
            move(num - 1, b, a, c);
        }
    }


}
