package collecting.homework;

import java.util.ArrayList;



@SuppressWarnings({"all"})
/**
 * ��Ҫ��ʵ�֣�
 * (1) ��װһ�������࣬����������������ԣ��ṩget��set��������дtoString��������ӡ����ʱֻ��ӡ���⣻
 * (2) ֻ�ṩһ���������Ĺ�������ʵ��������ʱ��ֻ��ʼ�����⣻����ʵ������������
 * ����һ���¹�ȷ�ﲡ����ǧ��������ӡ�Ƚ���ͽ����ӡ�ʥԡ�������ڵ���
 * ���Ŷ�������ͻȻ����2����ǰ�����㻹�����������һ���Ͻ�����
 * (3) �����Ŷ�����ӵ�ArrayList�����У����ҽ��е��������
 * (4) �ڱ������Ϲ����У������ű�����д�������15�ֵ�ֻ����ǰ15����Ȼ���ں�߼ӡ�����
 * (5) �ڿ���̨��ӡ������������������ű��⣻
 */

public class ArrTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("����ʵ��ս�����Ԥ����������Ĳ��������н���Խӣ�����ʮ�ĺź���Ա���齫��������ʵ��տ�չ����" ));
        arrayList.add(new News("20�Ҿ����ֽ�λ����������ҵķ�����λ������ս��"));

        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--){
            News o = (News)arrayList.get(i);
            System.out.println(processTitle(o.getTitle()));

        }




    }

    public static String processTitle(String title){
        if (title==null){
            return "��������� ";
            
        } else if (title.length() > 15) {
            return title.substring(0,15)+".....";
            
        }else {
            return title;

        }


    }
}


class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}