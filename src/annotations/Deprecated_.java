package annotations;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}


//1. @Deprecated ����ĳ��Ԫ��, ��ʾ��Ԫ���Ѿ���ʱ
//2. �������Ƽ�ʹ�ã�������Ȼ����ʹ��
//3. �鿴 @Deprecated ע�����Դ��
//4. �������η������࣬�ֶ�, ��, ����  �ȵ�
//5. @Deprecated �������汾��������ʹ��

/***
 * @Documented
 * @Retention(RetentionPolicy.RUNTIME)
 * @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
 * public @interface Deprecated {
 *
 * }**/



@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}