package leiBasis.exercise;

public class Find {
    //��д��Home_2�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У�
    //����������������Ҳ���������-1
    //����
    //1. ���� Home_2
    //2. ������ find
    //3. ����ֵ int
    //4. �β� (String , String[])

    public int find(String findStr, String[] strs) {
        //ֱ�ӱ����ַ������飬����ҵ����򷵻�����
        for(int i = 0; i < strs.length; i++) {
            if(findStr.equals(strs[i])) {
                return i;
            }
        }
        //���û�У��ͷ���-1
        return -1;
    }

    public static void main(String[] ages){
        Find i = new Find();
        String[] strs = {"hwj", "abc", "hwi"};
        double index = i.find("hwi",strs);
        System.out.println("���ҵ�indexֵ��"+index);
    }
}
