/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/10/16 20:43
 */


package lixi.resursive;

public class Int_ {
    public static void main(String[] args) {
        System.out.printf("\nSTEP=%d\n",jg(5));


    }

    public static int jg(int n){
        System.out.printf("n=%d\n",n);
        if (n == 1){
            return 1;
        }
        if (n % 2 == 0){
            return jg(n/2)+1;
        }else {
            return jg(3*n+1) + 1;
        }

    }
}
