package mianXiang.shop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * �����������Ǯͨ�ĸ������ܵ���
 * ʹ��OOP(���������)
 * ���������ܶ�Ӧһ������.
 */

public class SmallChangeSysOOP {
    //����..
    //������صı���
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2. �����Ǯͨ��ϸ
    //�Ϻ�˼·, (1) ���԰��������˺����ѣ����浽���� (2) ����ʹ�ö��� (3) �򵥵Ļ�����ʹ��Stringƴ��
    String details = "-----------------��Ǯͨ��ϸ------------------";

    //3. �����������  ��ɹ�����������Ա�����µı仯�ʹ���
    //�Ϻ�˼·, �����µı���
    double money = 0;
    double balance = 0;
    Date date = null; // date �� java.util.Date ���ͣ���ʾ����
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //�����������ڸ�ʽ����

    //4. ����
    //�����±������������ѵ�ԭ��
    String note = "";

    //�������ʾ�˵���������ѡ��
    public void mainMenu() {
        do {

            System.out.println("\n================��Ǯͨ�˵�(OOP)===============");
            System.out.println("\t\t\t1 ��Ǯͨ��ϸ");
            System.out.println("\t\t\t2 ��������");
            System.out.println("\t\t\t3 ����");
            System.out.println("\t\t\t4 ��     ��");

            System.out.print("��ѡ��(1-4): ");
            key = scanner.next();

            //ʹ��switch ��֧����
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("ѡ������������ѡ��");
            }

        } while (loop);
    }

    //�����Ǯͨ��ϸ
    public void detail() {
        System.out.println(details);
    }
    //�����������
    public void income() {
        System.out.print("�������˽��:");
        money = scanner.nextDouble();
        //money ��ֵ��ΧӦ��У�� -�� һ��������
        //��ʦ˼·, ���˼��
        //�ҳ�����ȷ�Ľ��������Ȼ�������ʾ, ��ֱ��return
        if(money <= 0) {
            System.out.println("�������˽�� ��Ҫ ���� 0");
            return; //�˳�����������ִ�к���Ĵ��롣
        }
        //�ҳ���ȷ��������
        balance += money;
        //ƴ������������Ϣ�� details
        date = new Date(); //��ȡ��ǰ����
        details += "\n��������\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }
    //����
    public void pay() {
        System.out.print("���ѽ��:");
        money = scanner.nextDouble();
        //money ��ֵ��ΧӦ��У�� -�� һ��������
        //�ҳ�����ȷ�����
        //����ն�� У�鷽ʽ.
        if(money <= 0 || money > balance) {
            System.out.println("������ѽ�� Ӧ���� 0-" + balance);
            return;
        }
        System.out.print("����˵��:");
        note = scanner.next();
        balance -= money;
        //ƴ��������Ϣ�� details
        date = new Date(); //��ȡ��ǰ����
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //�˳�
    public void exit() {
        //�û�����4�˳�ʱ��������ʾ"��ȷ��Ҫ�˳���? y/n"������������ȷ��y/n ��
        // ����ѭ������ָ�ֱ������y ���� n
        // �Ϻ�˼·����
        // (1) ����һ������ choice, �����û�������
        // (2) ʹ�� while + break, ��������յ�������ʱ y ���� n
        // (3) �˳�while�����ж�choice��y����n ,�Ϳ��Ծ����Ƿ��˳�
        // (4) ����һ�δ��룬���һ��С���ܣ�������Ҫ����һ��
        String choice = "";
        while (true) { //Ҫ���û���������y/n ,�����һֱѭ��
            System.out.println("��ȷ��Ҫ�˳���? y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
            //�ڶ�������
//                        if("y".equals(choice)) {
//                            loop = false;
//                            break;
//                        } else if ("n".equals(choice)) {
//                            break;
//                        }
        }

        //���û��˳�while ,�����ж�
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
