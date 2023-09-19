package leiBasis.exercise;

public class Music {
    String name;
    int times;
    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }
    //播放play功能
    public void play() {
        System.out.println("音乐 " + name + " 正在播放中.... 时长为" + times + "秒");
    }
    //返回本身属性信息的功能方法getInfo
    public String getInfo() {
        return "音乐 " + name + " 播放时间为" + times;
    }

    public static void main(String[] args) {
        Music music = new Music("笑傲江湖", 300);
        music.play();
        System.out.println(music.getInfo());
    }
}
