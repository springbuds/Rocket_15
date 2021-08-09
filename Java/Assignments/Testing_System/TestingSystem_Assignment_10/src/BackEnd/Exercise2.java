package BackEnd;

import Entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Exercise2 {
    private DepartmentDao dao ;

    public Exercise2() {
        dao = new DepartmentDao();
    }

    public void Ques1() throws SQLException, IOException {
        List<Department> departments = dao.getDepartments();
        departments.forEach(System.out::println);
    }

    public void Ques2() throws SQLException, IOException {
        Department department = dao.getDepartmentById(5);
        System.out.println(department);
    }
}
