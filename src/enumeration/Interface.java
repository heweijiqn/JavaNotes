package enumeration;

public class Interface {
    public static void main(String[] args) {
        Music classicmusic = Music.CLASSICMUSIC;
        classicmusic.playing();
        /**ö���½�����ʽ***/

        Music.CLASSICMUSIC.playing();


    }
}

//1.ʹ��enum�ؼ��ֺ󣬾Ͳ����ټ̳��������ˣ���Ϊenum����ʽ�̳�Enum����Java�ǵ��̳л���
//enum Season3 extends A {
//}
//2.enumʵ�ֵ�ö���࣬��Ȼ��һ���࣬���Ի��ǿ���ʵ�ֽӿڵ�.
interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("���ź���������...");
    }
}
