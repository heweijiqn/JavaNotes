package intreface_.enter;

import intreface_.enter.DBInterface;

public class MysqlDB implements DBInterface {

    @Override
    public void connect() {
        System.out.println("���� mysql");
    }

    @Override
    public void close() {
        System.out.println("�ر� mysql");
    }
}
