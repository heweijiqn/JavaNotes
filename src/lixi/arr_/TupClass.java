/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/23 14:12
 */


package lixi.arr_;

import java.util.ArrayList;


@SuppressWarnings("all")
class TupElem<E>						//三元组元素类
{	int r;								//行号
    int c;								//列号
    int d;								//元素值
    public TupElem(int r1,int c1,int d1)	//构造方法
    {
        r=r1;
        c=c1;
        d=d1;
    }
}
public class TupClass				//三元组表示类
{
    int rows;						//行数
    int cols;						//列数
    int nums;						//非零元素个数
    ArrayList<TupElem> data;		//稀疏矩阵对应的三元组顺序表
    public TupClass()				//构造方法
    {
        data=new ArrayList<TupElem>();
        nums=0;
    }
    public void CreateTup(int [][] A,int m,int n)	//创建三元组表示
    {
        rows=m; cols=n;
        for (int i=0;i<m;i++)
        {	for (int j=0;j<n;j++)
            if (A[i][j]!=0)			//只存储非零元素
            {
                data.add(new TupElem(i,j,A[i][j]));
                nums++;
            }
        }
    }
    public boolean Setvalue(int i,int j,int x)			//三元组元素赋值A[i][j]=x
    {
        int k=0;
        if (i<0 || i>=rows || j<0 || j>=cols)
            return false;								//下标错误时返回false
        while (k<nums && i>data.get(k).r)
            k++;										//找到第i行
        while (k<nums && i==data.get(k).r && j>data.get(k).c)
            k++;										//在第i行中找到第j列
        if (data.get(k).r==i && data.get(k).c==j)		//若存在这样的非0元素
            data.set(k,new TupElem(i,j,x));				//修改k下标元素值
        else											//不存在这样的元素时插入一个元素
        {
            data.add(k,new TupElem(i,j,x));				//在下标k位置插入新元素
            nums++;
        }
        return true;							//赋值成功时返回true
    }


    public int GetValue(int i, int j)			//执行x=A[i][j]
    {
        int k=0;
        if (i<0 || i>=rows || j<0 || j>=cols)
            return 0;							//下标错误时返回0
        while (k<nums && data.get(k).r<i)
            k++;								//找到第i行
        while (k<nums && data.get(k).r==i && data.get(k).c<j)
            k++;								//在第i行中找到第j列
        if (data.get(k).r==i && data.get(k).c==j)		//找到了这样的非0元素
            return data.get(k).d;					//返回非0元素值
        return 0;									//没有找到返回0
    }
    public void DispTup()						//输出三元组表示
    {
        if (nums<=0) return;					//没有非零元素时返回
        System.out.printf("行数=%d,列数=%d,非0元素个数=%d\n",rows,cols,nums);
        for (int i=0;i<nums;i++)
            System.out.printf("%5d%5d%5d\n",data.get(i).r,data.get(i).c,data.get(i).d);
    }
}
