package Common.packaging;

public class String_ {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "12345";
        //使用到自动装箱
        Integer i2 = Integer.parseInt(str4);
        //构造器
        Integer i3 = new Integer(str4);

    }
}
