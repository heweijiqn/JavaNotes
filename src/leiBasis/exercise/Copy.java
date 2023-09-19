package leiBasis.exercise;

public class Copy {
    public double[] copyArr(double[] oldArr){
        double[] newArr = new double[oldArr.length];
        for (double i = 0; i<oldArr.length; i++){
           newArr[(int) i] = oldArr[(int) i];

        }
        return newArr;
    }
    public static void main(String[] ages){
        double oldArr[] = {10, 23, 44};
        Copy i = new Copy();
        double [] newArr = i.copyArr(oldArr);
        System.out.println("-----------");
        for (double j = 0; j< newArr.length; j++){
            System.out.print(newArr[(int) j] + "\t");
        }
    }
}
