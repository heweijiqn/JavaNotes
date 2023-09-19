/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/10/16 20:57
 */


package lixi.resursive;

@SuppressWarnings("all")
public class Arr_ {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(max(arr,0,arr.length-1));


    }
    private static int max(int[] arr, int l, int r) {
        if (l == r){
            return arr[l];
        }
        int mid = (l+r)/2;
        int maxl = max(arr,l,mid);
        int maxr = max(arr,mid+1,r);
        return Math.max(maxl,maxr);
    }

}
