package enumeration;

public class Detail {
    public static void main(String[] args) {

        Season2 autumn = Season2.AUTUMN;
        Season2 summer = Season2.SUMMER;
        // 输出 枚举对象的名字
        System.out.println(autumn.name());
        // 编号
        System.out.println(autumn.ordinal());

        Season2[] values = Season2.values();
        for (Season2 season2:values){
            System.out.println(season2);
        }

        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1. 根据你输入的 "AUTUMN" 到 Season2 的枚举对象去查找
        //2. 如果找到了，就返回，如果没有找到，就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println("autumn=" + autumn);


        System.out.println(autumn == autumn1);

        /***Season{name='春天', desc='温暖'}
         Season{name='冬天', desc='寒冷'}
         Season{name='秋天', desc='凉爽'}
         Season{name='夏天', desc='炎热'}
         枚举对象*/

        /****
        public final int compareTo(E o) {

            return self.ordinal - other.ordinal;
        }
        Season2.AUTUMN 的编号[2] - Season2.SUMMER 的编号[3]
                */
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

    }
}
