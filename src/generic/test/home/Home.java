package generic.test.home;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class Home {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        //˵��
        //�������Ǹ�T ָ��������User
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"king"));
        dao.save("003", new User(3,38,"smith"));

        List<User> list = dao.list();

        System.out.println("list=" + list);

        dao.update("003", new User(3, 58, "milan"));
        dao.delete("001");//ɾ��
        System.out.println("===�޸ĺ�====");
        list = dao.list();
        System.out.println("list=" + list);

        System.out.println("id=003 " + dao.get("003"));//milan
        System.out.println("++++++++++++++++");
         dao.list1();

        System.out.println("+++++++++++++++++");
        dao.list2();





    }
}

