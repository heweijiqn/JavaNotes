package mhl.service;


import mhl.dao.BillDAO;
import mhl.dao.MultiTableDAO;
import mhl.domain.Bill;
import mhl.domain.MultiTableBean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ������˵���ص�ҵ���߼�
 */
public class BillService {
    //����BillDAO����
    private BillDAO billDAO = new BillDAO();
    //����MenuService ����
    private MenuService menuService = new MenuService();
    //����DiningTableService����
    private DiningTableService diningTableService = new DiningTableService();

    private MultiTableDAO multiTableDAO = new MultiTableDAO();

    //˼��
    //��д��͵ķ���
    //1. �����˵�
    //2. ��Ҫ���¶�Ӧ������״̬
    //3. ����ɹ�����true, ���򷵻�false
    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        //����һ���˵���,UUID
        String billID = UUID.randomUUID().toString();

        //���˵����ɵ�bill��, Ҫ��ֱ�Ӽ����˵����
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'δ����')",
                billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);

        if (update <= 0) {
            return false;
        }

        //��Ҫ���¶�Ӧ������״̬
        return diningTableService.updateDiningTableState(diningTableId, "�Ͳ���");

    }

    //�������е��˵��� �ṩ��View����
    public List<Bill> list() {
        return billDAO.queryMulti("select * from bill", Bill.class);
    }

    //�������е��˵������в�Ʒ��,�۸� �ṩ��View����
    public List<MultiTableBean> list2() {
        return multiTableDAO.queryMulti("SELECT bill.*, NAME " +
                "FROM bill, menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);
    }
    //�������е��˵������в�Ʒ��,�۸� �ṩ��View����
    public List<MultiTableBean> list3() {
        return multiTableDAO.queryMulti("SELECT bill.*, NAME " +
                "FROM bill, menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);
    }



    //�鿴ĳ�������Ƿ���δ���˵��˵�
    public boolean hasPayBillByDiningTableId(int diningTableId) {

        Bill bill =
                billDAO.querySingle("SELECT * FROM bill WHERE diningTableId=? AND state = 'δ����' LIMIT 0, 1", Bill.class, diningTableId);
        return bill != null;
    }

    //��ɽ���[����������ڣ����Ҹò�����δ���˵��˵�]
    //����ɹ�������true, ʧ�ܷ��� false
    public boolean payBill(int diningTableId, String payMode) {

        //�������ʹ������Ļ�����Ҫ��ThreadLocal����� , ����б���mybatis �ṩ������֧��
        //1. �޸�bill��
        int update = billDAO.update("update bill set state=? where diningTableId=? and state='δ����'", payMode, diningTableId);

        if(update <= 0) { //�������û�гɹ������ʾʧ��...
            return false;
        }
        //2. �޸�diningTable��
        //ע�⣺��Ҫֱ���������������Ӧ�õ���DiningTableService ����,��ɸ��£����ָ�˾��ְ

        if(!diningTableService.updateDiningTableToFree(diningTableId, "��")) {
            return false;
        }
        return true;

    }

}
