package mhl.view;


import mhl.domain.DiningTable;
import mhl.domain.Employee;
import mhl.domain.Menu;
import mhl.domain.MultiTableBean;
import mhl.service.BillService;
import mhl.service.DiningTableService;
import mhl.service.EmployeeService;
import mhl.service.MenuService;
import mhl.utils.Utility;

import java.util.List;

/**
 * @author ��ΰ��
 * @version 1.0
 */
@SuppressWarnings("all")
public class MHLView {

    //�����Ƿ��˳��˵�
    private boolean loop = true;
    private String key = ""; //�����û���ѡ��
    //����EmployeeService ����
    private EmployeeService employeeService = new EmployeeService();
    //����DiningTableService������
    private DiningTableService diningTableService = new DiningTableService();
    //����MenuService����
    private MenuService menuService = new MenuService();
    //����BillService����
    private BillService billService = new BillService();

    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    //��ɽ���
    public void payBill() {
        System.out.println("==============���˷���============");
        System.out.print("��ѡ��Ҫ���˵Ĳ������(-1�˳�): ");
        int diningTableId = Utility.readInt();
        if (diningTableId == -1) {
            System.out.println("=============ȡ������============");
            return;
        }
        //��֤�����Ƿ����
        DiningTable diningTable = diningTableService.getDiningTableById(diningTableId);
        if (diningTable == null) {
            System.out.println("=============���˵Ĳ���������============");
            return;
        }
        //��֤�����Ƿ�����Ҫ���˵��˵�
        if (!billService.hasPayBillByDiningTableId(diningTableId)) {
            System.out.println("=============�ò�λû��δ�����˵�============");
            return;
        }
        System.out.print("���˷�ʽ(�ֽ�/֧����/΢��)�س���ʾ�˳�: ");
        String payMode = Utility.readString(20, "");//˵������س������Ƿ��� ""
        if ("".equals(payMode)) {
            System.out.println("=============ȡ������============");
            return;
        }
        char key = Utility.readConfirmSelection();
        if (key == 'Y') { //����

            //��������д�ķ���
            if (billService.payBill(diningTableId, payMode)) {
                System.out.println("=============��ɽ���============");
            } else {
                System.out.println("=============����ʧ��============");
            }

        } else {
            System.out.println("=============ȡ������============");
        }
    }

    //��ʾ�˵���Ϣ
    public void listBill() {
//        List<Bill> bills = billService.list();
//        System.out.println("\n���\t\t��Ʒ��\t\t��Ʒ��\t\t���\t\t����\t\t����\t\t\t\t\t\t\t״̬");
//        for (Bill bill : bills) {
//            System.out.println(bill);
//        }
//        System.out.println("==============��ʾ���============");

        List<MultiTableBean> multiTableBeans = billService.list2();
        System.out.println("\n���\t\t��Ʒ��\t\t��Ʒ��\t\t���\t\t����\t\t����\t\t\t\t\t\t\t״̬\t\t��Ʒ��\t\t�۸�");
        for (MultiTableBean bill : multiTableBeans) {
            System.out.println(bill);
        }
        System.out.println("==============��ʾ���============");
    }

    //��ɵ��
    public void orderMenu() {
        System.out.println("==============��ͷ���============");
        System.out.print("�������͵�����(-1�˳�): ");
        int orderDiningTableId = Utility.readInt();
        if (orderDiningTableId == -1) {
            System.out.println("==============ȡ�����============");
            return;
        }
        System.out.print("�������͵Ĳ�Ʒ��(-1�˳�): ");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1) {
            System.out.println("==============ȡ�����============");
            return;
        }
        System.out.print("�������͵Ĳ�Ʒ��(-1�˳�): ");
        int orderNums = Utility.readInt();
        if (orderNums == -1) {
            System.out.println("==============ȡ�����============");
            return;
        }

        //��֤�������Ƿ����.
        DiningTable diningTable = diningTableService.getDiningTableById(orderDiningTableId);
        if (diningTable == null){
            System.out.println("==============�����Ų�����============");
            return;
        }
        if (!("��".equals(diningTable.getState()))) {//˵����ǰ����������� "��" ״̬
            System.out.println("==============�ò���ȷ����ʹ���� ============");
            //��֤��Ʒ���
            Menu menu = menuService.getMenuById(orderMenuId);
            if (menu == null) {
                System.out.println("==============��Ʒ�Ų�����============");
                return;
            }

            //���
            if (billService.orderMenu(orderMenuId, orderNums, orderDiningTableId)) {
                System.out.println("==============��ͳɹ�============");
            } else {
                System.out.println("==============���ʧ��============");
            }
            return ;
        }else {
            System.out.println("�ò���δ��Ԥ�� ");
        }
        //��֤��Ʒ���
//        Menu menu = menuService.getMenuById(orderMenuId);
//        if (menu == null) {
//            System.out.println("==============��Ʒ�Ų�����============");
//            return;
//        }
//
//        //���
//        if (billService.orderMenu(orderMenuId, orderNums, orderDiningTableId)) {
//            System.out.println("==============��ͳɹ�============");
//        } else {
//            System.out.println("==============���ʧ��============");
//        }

    }

    //��ʾ���в�Ʒ
    public void listMenu() {
        List<Menu> list = menuService.list();
        System.out.println("\n��Ʒ���\t\t��Ʒ��\t\t���\t\t�۸�");
        for (Menu menu : list) {
            System.out.println(menu);
        }
        System.out.println("==============��ʾ���============");
    }

    //��ɶ���
    public void orderDiningTable() {
        System.out.println("==============Ԥ������============");
        System.out.print("��ѡ��ҪԤ���Ĳ������(-1�˳�): ");
        int orderId = Utility.readInt();
        if (orderId == -1) {
            System.out.println("==============ȡ��Ԥ������============");
            return;
        }
        //�÷����õ����� Y ���� N
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {//ҪԤ��

            //����orderId ���� ��ӦDiningTable����, ���Ϊnull, ˵���ö��󲻴���
            DiningTable diningTable = diningTableService.getDiningTableById(orderId);
            if (diningTable == null) {//
                System.out.println("==============Ԥ������������============");
                return;
            }
            //�жϸò�����״̬�Ƿ� "��"
            if (!("��".equals(diningTable.getState()))) {//˵����ǰ����������� "��" ״̬
                System.out.println("==============�ò����Ѿ�Ԥ�����߾Ͳ���============");
                return;
            }

            //����Ԥ����Ϣ
            System.out.print("Ԥ���˵�����: ");
            String orderName = Utility.readString(50);
            System.out.print("Ԥ���˵ĵ绰: ");
            String orderTel = Utility.readString(50);

            //���²���״̬
            if (diningTableService.orderDiningTable(orderId, orderName, orderTel)) {
                System.out.println("==============Ԥ�������ɹ�============");
            } else {
                System.out.println("==============Ԥ������ʧ��============");
            }

        } else {
            System.out.println("==============ȡ��Ԥ������============");
        }

    }

    //��ʾ���в���״̬
    public void listDiningTable() {
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n�������\t\t����״̬");
        for (DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("==============��ʾ���============");
    }

    //��ʾ���˵�
    public void mainMenu() {

        while (loop) {

            System.out.println("\n===============����¥================");
            System.out.println("\t\t 1 ��¼����¥");
            System.out.println("\t\t 2 �˳�����¥");
            System.out.print("���������ѡ��: ");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("����Ա����: ");
                    String empId = Utility.readString(50);
                    System.out.print("������  ��: ");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeByIdAndPwd(empId, pwd);
                    if (employee != null) { //˵�����ڸ��û�
                        System.out.println("===============��¼�ɹ�[" + employee.getName() + "]================\n");
                        //��ʾ�����˵�, ��������˵���ѭ����������������while
                        while (loop) {
                            System.out.println("\n===============����¥(�����˵�)================");
                            System.out.println("\t\t 1 ��ʾ����״̬");
                            System.out.println("\t\t 2 Ԥ������");
                            System.out.println("\t\t 3 ��ʾ���в�Ʒ");
                            System.out.println("\t\t 4 ��ͷ���");
                            System.out.println("\t\t 5 �鿴�˵�");
                            System.out.println("\t\t 6 ����");
                            System.out.println("\t\t 9 �˳�����¥");
                            System.out.print("���������ѡ��: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    listDiningTable();//��ʾ����״̬
                                    break;
                                case "2":
                                    orderDiningTable();
                                    break;
                                case "3":
                                    listMenu();
                                    break;
                                case "4":
                                    orderMenu();
                                    break;
                                case "5":
                                    listBill();//��ʾ�����˵�
                                    break;
                                case "6":
                                    payBill();
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("���������������������");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("===============��¼ʧ��================");
                    }
                    break;
                case "2":
                    loop = false;//
                    break;
                default:
                    System.out.println("��������������������.");
            }
        }
        System.out.println("���˳�������¥ϵͳ~");
    }

}
