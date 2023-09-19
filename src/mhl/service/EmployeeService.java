package mhl.service;


import mhl.dao.EmployeeDAO;
import mhl.domain.Employee;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ������ɶ�employee��ĸ��ֲ���(ͨ������EmployeeDAO�������)
 */
public class EmployeeService {

    //����һ�� EmployeeDAO ����
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    //����������empId �� pwd ����һ��Employee����
    //�����ѯ�������ͷ���null
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {

        return employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);

    }
}
