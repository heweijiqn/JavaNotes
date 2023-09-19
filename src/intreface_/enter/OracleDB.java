package intreface_.enter;

import intreface_.enter.DBInterface;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("Á¬½Ó oracle");
    }

    @Override
    public void close() {
        System.out.println("¹Ø±Õ oracle");
    }
}
