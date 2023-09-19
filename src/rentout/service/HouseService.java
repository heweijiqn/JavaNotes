package rentout.service;

import rentout.domain.House;

public class HouseService{
    private House[] houses; //����House����
    private int houseNums = 1; //��¼��ǰ�ж��ٸ�������Ϣ
    private int idCounter = 1; //��¼��ǰ��id�������ĸ�ֵ
    //������



//  Ĭ������
//  ������
    public HouseService(int size) {
        //new houses
        houses = new House[size];//������HouseService����ָ�������С
        //Ϊ����ϲ����б���Ϣ���Ϻ������ʼ��һ��House����
        houses[0] = new House(1,"jack","112", "������", 2000, "δ����");
    }
    //findById����,����House�������null
    public House findById(int findId) {

        //��������
        for(int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()) {
                return houses[i];
            }
        }

        return null;

    }

    //del������ɾ��һ��������Ϣ
    public boolean del(int delId) {

        //Ӧ�����ҵ�Ҫɾ���ķ�����Ϣ��Ӧ���±�
        //�Ϻ�ǿ����һ��Ҫ����� �±�ͷ��ݵı�Ų���һ����
        int index = -1;
        for(int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()) {//Ҫɾ���ķ���(id),�������±�Ϊi��Ԫ��
                index = i;//��ʹ��index��¼i
            }
        }

        if(index == -1) {//˵��delId�������в�����(�е���..)
            return false;
        }
        //����ҵ�, ������ҪС��鶯�Խ�,�е���.
        //��ʦ˼·����:
        for(int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        //�ѵ��д��ڵķ�����Ϣ�����һ�� ����null
        houses[--houseNums] = null;
        return true;

    }

    //add����������¶���,����boolean
    public boolean add(House newHouse) {
        //�ж��Ƿ񻹿��Լ������(������ʱ�������������ݵ�����) => �ܷ��Լ������������ݻ���(~~)
        if(houseNums == houses.length) {//���������
            System.out.println("���������������������...");
            return false;
        }
        //��newHouse������뵽����������һ������
        houses[houseNums++] = newHouse;
        //���ǳ���Ա��Ҫ���һ��id�������Ļ���, Ȼ�����newHouse��id
        newHouse.setId(++idCounter);
        return true;
    }

    //list����������houses
    public House[] list() {
        return houses;
    }
}
