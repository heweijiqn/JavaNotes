package intreface_.enter;

import intreface_.enter.DBInterface;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("���� oracle");
    }

    @Override
    public void close() {
        System.out.println("�ر� oracle");
    }
}
