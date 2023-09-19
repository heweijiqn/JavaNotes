package lixi.shu;

import java.lang.*;
import java.util.*;
@SuppressWarnings("all")
class BTNode<E>									//二叉链中结点类
{	E data;										//数据元素
	BTNode lchild;								//指向左孩子结点
	BTNode rchild;								//指向右孩子结点
	public BTNode()								//默认构造方法
	{
		lchild=rchild=null;
	}
	public BTNode(E d)							//重载构造方法
	{
		data=d;
		lchild=rchild=null;
	}
}
public class BTreeClass							//二叉树类
{
	BTNode<Character> b;						//根结点
	String bstr;								//二叉树的括号表示串
	public BTreeClass()							//构造方法
	{
		b=null;
	}
	public void CreateBTree(String str)			//创建以b为根结点的二叉链存储结构
	{
		Stack<BTNode> st=new Stack<BTNode>();	//建立一个栈
		BTNode<Character> p=null;
		boolean flag=true;
		char ch;
		int i=0;
		while (i<str.length())					//循环扫描str中每个字符
		{
			ch=str.charAt(i);
			//System.out.println(v);
			switch(ch)
			{
			case '(':
					st.push(p);						//刚刚新建的结点有孩子,将其进栈
					flag=true;
					break;
			case ')':
					st.pop();						//栈顶结点的子树处理完，出栈
					break;
			case ',':
					flag=false;						//开始处理栈顶结点的右孩子
					break;
			default:
					p=new BTNode<Character>(ch);	//用ch值新建一个结点
					if (b==null)
						b=p;						//若尚未建立根结点,p作为根结点
					else							//已建立二叉树根结点
					{
						if (flag)					//新结点p作为栈顶结点的左孩子
						{
							if (!st.empty())
								st.peek().lchild=p;
						}
						else						//新结点p作为栈顶结点的右孩子
						{
							if (!st.empty())
								st.peek().rchild=p;
						}
					}
					break;
			}
			i++;								//继续遍历
		}
	}
	public String toString()					//返回二叉链的括号表示串
	{
		bstr="";
		toString1(b);
		return bstr;
	}
	void toString1(BTNode<Character> t)		//被DispBTNode方法调用
	{
		if (t!=null)
		{	bstr+=t.data;						//输出根结点值
			if (t.lchild!=null || t.rchild!=null)
			{
				bstr+="(";						//有孩子结点时输出"("
				toString1(t.lchild);			//递归输出左子树
				if (t.rchild!=null)
					bstr+=",";					//有右孩子结点时输出","
				toString1(t.rchild);			//递归输出右子树
				bstr+=")";						//输出")"
			}
		}
	}
	public BTNode<Character> FindNode(char x)	//查找值为x的结点算法
	{
		return FindNode1(b,x);
	}
	private BTNode<Character> FindNode1(BTNode<Character> t,char x)	//被FindNode方法调用
	{
		BTNode<Character> p;
		if (t==null) return null;				//t为空时返回null
		else if (t.data==x) return t;			//t所指结点值为x时返回t
		else
		{	p=FindNode1(t.lchild,x);			//在左子树中查找
			if (p!=null) return p;				//在左子树中找到p结点，返回p
			else return FindNode1(t.rchild,x);	//返回在右子树中查找结果
		}
	}
	public int Height()							//求二叉树高度的算法
	{
		return Height1(b);
	}
	private int Height1(BTNode<Character> t)	//被Height方法调用
	{
		int lchildh,rchildh;
		if (t==null)
			return 0;							//空树的高度为0
		else
		{
			lchildh=Height1(t.lchild);			//求左子树高度lchildh
			rchildh=Height1(t.rchild);			//求右子树高度rchildh
			return Math.max(lchildh,rchildh)+1;
		}
	}
}
