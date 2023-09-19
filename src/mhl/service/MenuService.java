package mhl.service;


import mhl.dao.MenuDAO;
import mhl.domain.Menu;

import java.util.List;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ��ɶ�menu��ĸ��ֲ���(ͨ������MenuDAO)
 */
public class MenuService {

    //����MenuDAO ����
    private MenuDAO menuDAO = new MenuDAO();

    //�������еĲ�Ʒ, ���ظ�����ʹ��
    public List<Menu> list() {
        return menuDAO.queryMulti("select * from menu", Menu.class);
    }

    //��Ҫ����������id, ����Menu����
    public Menu getMenuById(int id) {
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
    }
}
