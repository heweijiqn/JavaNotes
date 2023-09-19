package rentout.view;

import rentout.domain.House;
import rentout.service.HouseService;
import rentout.utolity.Utility;

public class HouseView {
    private boolean loop = true; //������ʾ�˵�
    private char key = ' '; //�����û�ѡ��
    private HouseService houseService = new HouseService(2);//��������Ĵ�СΪ2


    //����id�޸ķ�����Ϣ
    public void update() {
        System.out.println("=============�޸ķ�����Ϣ============");
        System.out.println("��ѡ����޸ķ��ݱ��(-1��ʾ�˳�)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=============������޸ķ�����Ϣ============");
            return;
        }

        //��������õ�updateId�����Ҷ���

        //��ʦ�ر���ʾ:���ص�����������[��:���������Ԫ��]
        //�����ʦ�ں����house.setXxx() ,�ͻ��޸�HouseService��houses�����Ԫ��!!!!!!!!!!
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=============�޸ķ�����Ϣ��Ų�����..============");
            return;
        }

        System.out.print("����(" + house.getName() + "): ");
        String name = Utility.readString(8, "");//��������û�ֱ�ӻس���ʾ���޸ĸ���Ϣ,Ĭ��""
        if (!"".equals(name)) {//�޸�
            house.setName(name);
        }

        System.out.print("�绰(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("��ַ(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("���(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("״̬(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("=============�޸ķ�����Ϣ�ɹ�============");


    }

    //����id���ҷ�����Ϣ
    public void findHouse() {
        System.out.println("=============���ҷ�����Ϣ============");
        System.out.print("������Ҫ���ҵ�id: ");
        int findId = Utility.readInt();
        //���÷���
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("=============���ҷ�����Ϣid������============");
        }
    }

    //����˳�ȷ��
    public void exit() {
        //��������ʹ��Utility�ṩ���������ȷ��
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //��дdelHouse() ���������id,����Service ��del����
    public void delHouse() {
        System.out.println("=============ɾ��������Ϣ============");
        System.out.print("�������ɾ�����ݵı��(-1�˳�):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=============����ɾ��������Ϣ============");
            return;
        }
        //ע��÷����������ѭ���жϵ��߼�,�������Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {//���ɾ��
            if (houseService.del(delId)) {
                System.out.println("=============ɾ��������Ϣ�ɹ�============");
            } else {
                System.out.println("=============���ݱ�Ų����ڣ�ɾ��ʧ��============");
            }
        } else {
            System.out.println("=============����ɾ��������Ϣ============");
        }

    }

    //��дaddHouse() �������룬����House���󣬵���add����
    public void addHouse() {
        System.out.println("=============��ӷ���============");
        System.out.print("����: ");
        String name = Utility.readString(8);
        System.out.print("�绰: ");
        String phone = Utility.readString(12);
        System.out.print("��ַ: ");
        String address = Utility.readString(16);
        System.out.print("����: ");
        int rent = Utility.readInt();
        System.out.print("״̬: ");
        String state = Utility.readString(3);
        //����һ���µ�House����, ע��id ��ϵͳ����ģ�
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============��ӷ��ݳɹ�============");
        } else {
            System.out.println("=============��ӷ���ʧ��============");
        }

    }

    //��дlistHouses()��ʾ�����б�
    public void listHouses() {
        System.out.println("=============�����б�============");
        System.out.println("���\t\t����\t\t�绰\t\t��ַ\t\t����\t\t״̬(δ����/�ѳ���)");
        House[] houses = houseService.list();//�õ����з�����Ϣ
        for (int i = 0; i < houses.length; i++) {//������룬�����Ϻ���ʲô����,��
            if (houses[i] == null) {//���Ϊnull,�Ͳ�������ʾ��
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=============�����б���ʾ���============");

    }

    //��ʾ���˵�
    public void mainMenu() {

        do {
            System.out.println("\n=============���ݳ���ϵͳ�˵�============");
            System.out.println("\t\t\t1 �� �� �� Դ");
            System.out.println("\t\t\t2 �� �� �� ��");
            System.out.println("\t\t\t3 ɾ �� �� �� �� Ϣ");
            System.out.println("\t\t\t4 �� �� �� �� �� Ϣ");
            System.out.println("\t\t\t5 �� �� �� ��");
            System.out.println("\t\t\t6 ��      ��");
            System.out.print("���������ѡ��(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
