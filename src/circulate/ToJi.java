package circulate;

public class ToJi {
	public static void main(String[] args) {
		int count = 0;//初始化统计
		for(int i=2;i<=100;i++){
			boolean isSuShuflag = true;  //初始化素数标记
			for (int j=2;j<i ;j++ ){
				if(i%j == 0){
					isSuShuflag = false;
					break;
				}
			}
			if(isSuShuflag){
				System.out.print( i + " ");
				count++;
				if(count%8 == 0){//每8个换一行
					// count=0   归零 
					System.out.println();
				}
			}
		}
	}
}
