/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/23 14:12
 */


package lixi.arr_;

import java.util.ArrayList;


@SuppressWarnings("all")
class TupElem<E>						//��Ԫ��Ԫ����
{	int r;								//�к�
    int c;								//�к�
    int d;								//Ԫ��ֵ
    public TupElem(int r1,int c1,int d1)	//���췽��
    {
        r=r1;
        c=c1;
        d=d1;
    }
}
public class TupClass				//��Ԫ���ʾ��
{
    int rows;						//����
    int cols;						//����
    int nums;						//����Ԫ�ظ���
    ArrayList<TupElem> data;		//ϡ������Ӧ����Ԫ��˳���
    public TupClass()				//���췽��
    {
        data=new ArrayList<TupElem>();
        nums=0;
    }
    public void CreateTup(int [][] A,int m,int n)	//������Ԫ���ʾ
    {
        rows=m; cols=n;
        for (int i=0;i<m;i++)
        {	for (int j=0;j<n;j++)
            if (A[i][j]!=0)			//ֻ�洢����Ԫ��
            {
                data.add(new TupElem(i,j,A[i][j]));
                nums++;
            }
        }
    }
    public boolean Setvalue(int i,int j,int x)			//��Ԫ��Ԫ�ظ�ֵA[i][j]=x
    {
        int k=0;
        if (i<0 || i>=rows || j<0 || j>=cols)
            return false;								//�±����ʱ����false
        while (k<nums && i>data.get(k).r)
            k++;										//�ҵ���i��
        while (k<nums && i==data.get(k).r && j>data.get(k).c)
            k++;										//�ڵ�i�����ҵ���j��
        if (data.get(k).r==i && data.get(k).c==j)		//�����������ķ�0Ԫ��
            data.set(k,new TupElem(i,j,x));				//�޸�k�±�Ԫ��ֵ
        else											//������������Ԫ��ʱ����һ��Ԫ��
        {
            data.add(k,new TupElem(i,j,x));				//���±�kλ�ò�����Ԫ��
            nums++;
        }
        return true;							//��ֵ�ɹ�ʱ����true
    }


    public int GetValue(int i, int j)			//ִ��x=A[i][j]
    {
        int k=0;
        if (i<0 || i>=rows || j<0 || j>=cols)
            return 0;							//�±����ʱ����0
        while (k<nums && data.get(k).r<i)
            k++;								//�ҵ���i��
        while (k<nums && data.get(k).r==i && data.get(k).c<j)
            k++;								//�ڵ�i�����ҵ���j��
        if (data.get(k).r==i && data.get(k).c==j)		//�ҵ��������ķ�0Ԫ��
            return data.get(k).d;					//���ط�0Ԫ��ֵ
        return 0;									//û���ҵ�����0
    }
    public void DispTup()						//�����Ԫ���ʾ
    {
        if (nums<=0) return;					//û�з���Ԫ��ʱ����
        System.out.printf("����=%d,����=%d,��0Ԫ�ظ���=%d\n",rows,cols,nums);
        for (int i=0;i<nums;i++)
            System.out.printf("%5d%5d%5d\n",data.get(i).r,data.get(i).c,data.get(i).d);
    }
}
