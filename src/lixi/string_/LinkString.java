/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/16 19:28
 */


package lixi.string_;

public class LinkString {
    public static void delabc(LinkStringClass s) {
        LinkNode pre=s.head;//preָ��s��ͷ���
        LinkNode p=pre.next;//pָ��s�ĵ�һ�����
        if (p==null || p.next==null || p.next.next==null){
            return;
        }
        while (p!=null && p.next!=null && p.next.next!=null) {
            if (p.data=='a' && p.next.data=='b' && p.next.next.data=='c') {
                pre.next=p.next.next.next;
                p=pre.next;
            }
            else {
                pre=pre.next;
                p=pre.next;
            }
        }
    }

    public static void main(String[] args) {
        char [] cstr={'a','b','c','a','b','c','d'};
        LinkStringClass s=new LinkStringClass();
        s.StrAssign(cstr);
        delabc(s);
        System.out.println(s.toString());
    }
}
