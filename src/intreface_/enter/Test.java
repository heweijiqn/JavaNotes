package intreface_.enter;

import intreface_.enter.DBInterface;
import intreface_.enter.MysqlDB;
import intreface_.enter.OracleDB;

public class Test {
    public static void bing(DBInterface db) {
        db.connect();
        db.close();
    }

    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        bing(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        bing(oracleDB);
    }

}
