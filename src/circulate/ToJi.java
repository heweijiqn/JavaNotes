package circulate;

public class ToJi {
	public static void main(String[] args) {
		int count = 0;//��ʼ��ͳ��
		for(int i=2;i<=100;i++){
			boolean isSuShuflag = true;  //��ʼ���������
			for (int j=2;j<i ;j++ ){
				if(i%j == 0){
					isSuShuflag = false;
					break;
				}
			}
			if(isSuShuflag){
				System.out.print( i + " ");
				count++;
				if(count%8 == 0){//ÿ8����һ��
					// count=0   ���� 
					System.out.println();
				}
			}
		}
	}
}
