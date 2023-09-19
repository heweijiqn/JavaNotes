package mhl.service;

import mhl.dao.DiningTableDAO;
import mhl.domain.DiningTable;

import java.util.List;

/**
 * @author ��˳ƽ
 * @version 1.0
 */
public class DiningTableService { //ҵ���
    //����һ��DiningTableDAO����
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //�������в�������Ϣ
    public List<DiningTable> list() {

        return diningTableDAO.queryMulti("select id, state from diningTable", DiningTable.class);
    }

    //����id , ��ѯ��Ӧ�Ĳ���DiningTable ����
    //,�������null , ��ʾid��Ŷ�Ӧ�Ĳ���������
    public DiningTable getDiningTableById(int id) {


        //�Ϻ�С���ɣ���sql�����ڲ�ѯ������ȥ����һ��.
        return diningTableDAO.querySingle("select * from diningTable where id = ?", DiningTable.class, id);
    }

    //�����������Ԥ�������÷���������״̬���и���(����Ԥ���˵����ֺ͵绰)
    public boolean orderDiningTable(int id, String orderName, String orderTel) {

        int update =
                diningTableDAO.update("update diningTable set state='�Ѿ�Ԥ��', orderName=?, orderTel=? where id=?", orderName, orderTel, id);

        return  update > 0;
    }

    //��Ҫ�ṩһ������ ����״̬�ķ���
    public boolean updateDiningTableState(int id, String state) {

        int update = diningTableDAO.update("update diningTable set state=? where id=?", state, id);
        return update > 0;
    }

    //�ṩ��������ָ���Ĳ�������Ϊ����״̬
    public boolean updateDiningTableToFree(int id, String state) {

        int update = diningTableDAO.update("update diningTable set state=?,orderName='',orderTel='' where id=?", state, id);
        return update > 0;
    }

}
