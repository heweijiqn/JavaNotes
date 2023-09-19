package shuZhu;

public class ShuZhu_Max {
    public  static void main(String[] ages){
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];//假定第一个元素就是最大值
        int maxIndex = 0; //
        for(int i = 1; i < arr.length; i++) {//从下标 1 开始遍历 arr
            if(max < arr[i]) {//如果 max < 当前元素
                max = arr[i]; //把 max 设置成 当前元素
                maxIndex = i;
            }
        }
        //当我们遍历这个数组 arr 后 , max 就是真正的最大值，maxIndex 最大值下标
        System.out.println("max=" + max + " maxIndex=" + maxIndex);
    }

}

