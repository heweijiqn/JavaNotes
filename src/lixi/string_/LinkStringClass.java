package lixi.string_;

class LinkNode								//链串结点类型
{	char data;								//存放一个字符
	LinkNode next;							//指向下一个结点的指针
	public LinkNode()						//构造方法
	{
		next=null;
	}
	public LinkNode(char ch)				//重载构造方法
	{
		data=ch;
		next=null;
	}
}
public class LinkStringClass				//链串类
{
	LinkNode head;
	int size;       						//串中字符个数
	public LinkStringClass()				//构造方法
	{
		head=new LinkNode();				//建立头结点
		size=0;
	}
	//串的基本运算算法
	public void StrAssign(char [] cstr)		//创建一个串
	{
		LinkNode t=head,p;					//t始终指向尾结点
		for (int i=0;i<cstr.length;i++)		//循环建立字符结点
		{	p=new LinkNode(cstr[i]);
			t.next=p; t=p;					//将p结点插入到尾部
			size++;
		}
		t.next=null;						//尾结点的next置为空
	}
	public char geti(int i)					//取序号i的字符
	{
		if (i<0 || i>size-1)
			throw new IllegalArgumentException("栈空");
		LinkNode p=head;
		int j=-1;
		while (j<i)
		{
			j++;
			p=p.next;
		}
		return p.data;
	}

	public LinkStringClass StrCopy()		//串复制
	{
		LinkStringClass s=new LinkStringClass();
		LinkNode t=s.head,p=head,q;
		while (p!=null)
		{
			q=new LinkNode(p.data);
			t.next=q; t=q;
			p=p.next;
		}
		t.next=null;						//尾结点的next置为空
		s.size=size;
		return s;
	}
	public int size()						//求串长
	{
		return size;
	}
	public LinkStringClass Concat(LinkStringClass t) 	//串连接
	{
		LinkStringClass s=new LinkStringClass();//新建一个空串
		LinkNode p=head.next,q,r;
		r=s.head;
		while (p!=null)							//将当前链串的所有结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;						//将q结点插入到尾部
			p=p.next;
		}
		p=t.head.next;
		while (p!=null)							//将链串t的所有结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;						//将q结点插入到尾部
			p=p.next;
		}
		s.size=size+t.size;
		r.next=null;							//尾结点的next置为空
		return s;								//返回新串s
	}
	public LinkStringClass SubStr(int i,int j)		//求子串
	{
		LinkStringClass s=new LinkStringClass();	//新建一个空串
		LinkNode p=head.next,q,t;
		t=s.head;									//t指向新建链表的尾结点
		if (i<0 || i>=size || j<0 || i+j>size)
			return s;								//参数不正确时返回空串
		for (int k=0;k<i;k++)
			p=p.next;
		for (int k=1;k<=j;k++) 						//将s的序号i结点开始的j个结点复制到s
		{
			q=new LinkNode(p.data);
			t.next=q; t=q;							//将q结点插入到尾部
			p=p.next;
		}
		s.size=j;
		t.next=null;								//尾结点的next置为空
		return s;									//返回新建的链串
	}
	public LinkStringClass InsStr(int i,LinkStringClass t)	//串插入
	{
		LinkStringClass s=new LinkStringClass();	//新建一个空串
		if (i<0 || i>size)							//参数不正确时返回空串
			return s;
		LinkNode p=head.next,p1=t.head.next,q,r;
		r=s.head;									//r指向新建链表的尾结点
		for (int k=0; k<i; k++)						//将当前链串的前i个结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p=p.next;
		}
		while (p1!=null)							//将t中所有结点复制到s
		{	q=new LinkNode(p1.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p1=p1.next;
		}
		while (p!=null)								//将p及其后的结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p=p.next;
		}
		s.size=size+t.size;
		r.next=null;								//尾结点的next置为空
		return s;									//返回新建的链串
	}
	public LinkStringClass DelStr(int i,int j)		//串删除
	{
		LinkStringClass s=new LinkStringClass();	//新建一个空串
		if (i<0 || i>size || i+j>size)				//参数不正确时返回空串
			return s;
		LinkNode p=head.next,q,t;
		t=s.head;									//t指向新建链表的尾结点
		for (int k=0; k<i;k++)							//将s的前i个结点复制到s
		{	q=new LinkNode(p.data);
			t.next=q; t=q;							//将q结点插入到尾部
			p=p.next;
		}
		for (int k=0;k<j;k++)						//让p沿next跳j个结点
			p=p.next;
		while (p!=null)								//将p及其后的结点复制到s
		{	q=new LinkNode(p.data);
			t.next=q; t=q;							//将q结点插入到尾部
			p=p.next;
		}
		s.size=size-j;
		t.next=null;								//尾结点的next置为空
		return s;									//返回新建的链串
	}
	public LinkStringClass RepStr(int i,int j,LinkStringClass t) //串替换
	{
		LinkStringClass s=new LinkStringClass();	//新建一个空串
		if (i<0 || i>size || i+j>size)				//参数不正确时返回空串
			return s;

		LinkNode p=head.next,p1=t.head.next,q,r;
		r=s.head;									//r指向新建链表的尾结点
		for (int k=0; k<i; k++)						//将s的前i个结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p=p.next;
		}
		for (int k=0;k<j;k++)						//让p沿next跳j个结点
			p=p.next;
		while (p1!=null)							//将t中所有结点复制到s
		{	q=new LinkNode(p1.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p1=p1.next;
		}
		while (p!=null)								//将p及其后的结点复制到s
		{	q=new LinkNode(p.data);
			r.next=q; r=q;							//将q结点插入到尾部
			p=p.next;
		}
		s.size=size-j+t.size;
		r.next=null;								//尾结点的next置为空
		return s;									//返回新建的链串
	}
	public String toString()						//将串转换为字符串。
	{
		String ans="";
		LinkNode p=head.next;
		while (p!=null)
		{
			ans+=p.data+" ";
			p=p.next;
		}
		return ans;
	}
}
