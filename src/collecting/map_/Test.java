package collecting.map_;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //��ɴ���
        Map hashMap = new HashMap();
        //��Ӷ���
        hashMap.put(1, new Emp("jack", 300000, 1));
        hashMap.put(2, new Emp("tom", 21000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));


        //����2�ַ�ʽ
        //��������ʾ����>18000��Ա��(������ʽ��������)
        //1. ʹ��keySet  -> ��ǿfor
        Set keySet = hashMap.keySet();
        System.out.println("====��һ�ֱ�����ʽ====");
        for (Object key : keySet) {
            //�Ȼ�ȡvalue
            Emp emp = (Emp) hashMap.get(key);
            if(emp.getSal() >18000) {
                System.out.println(emp);
            }
        }

        //2. ʹ��EntrySet -> ������
        //   ���ֱȽ��ѵ�֪ʶ��
        //   ����Ʒ��ԽƷԽ��ζ��.
        Set entrySet = hashMap.entrySet();
        System.out.println("======������======");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            //ͨ��entry ȡ��key �� value
            Emp emp = (Emp) entry.getValue();
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

    }
}
/**
 * ʹ��HashMap���3��Ա������Ҫ��
 * ����Ա��id
 * ֵ��Ա������
 *
 * ��������ʾ����>18000��Ա��(������ʽ��������)
 * Ա���ࣺ���������ʡ�Ա��id
 */
class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return Double.compare(emp.sal, sal) == 0 && id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, id);
    }
}


