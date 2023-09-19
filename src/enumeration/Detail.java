package enumeration;

public class Detail {
    public static void main(String[] args) {

        Season2 autumn = Season2.AUTUMN;
        Season2 summer = Season2.SUMMER;
        // ��� ö�ٶ��������
        System.out.println(autumn.name());
        // ���
        System.out.println(autumn.ordinal());

        Season2[] values = Season2.values();
        for (Season2 season2:values){
            System.out.println(season2);
        }

        //valueOf�����ַ���ת����ö�ٶ���Ҫ���ַ�������Ϊ���еĳ������������쳣
        //ִ������
        //1. ����������� "AUTUMN" �� Season2 ��ö�ٶ���ȥ����
        //2. ����ҵ��ˣ��ͷ��أ����û���ҵ����ͱ���
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println("autumn=" + autumn);


        System.out.println(autumn == autumn1);

        /***Season{name='����', desc='��ů'}
         Season{name='����', desc='����'}
         Season{name='����', desc='��ˬ'}
         Season{name='����', desc='����'}
         ö�ٶ���*/

        /****
        public final int compareTo(E o) {

            return self.ordinal - other.ordinal;
        }
        Season2.AUTUMN �ı��[2] - Season2.SUMMER �ı��[3]
                */
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

    }
}
