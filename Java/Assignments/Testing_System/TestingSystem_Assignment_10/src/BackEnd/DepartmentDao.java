package BackEnd;
import Entity.Department;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DepartmentDao {
    public List<Department> getDepartments() throws SQLException, IOException {
        List<Department> departments = new ArrayList<>();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connection Success");

        String sql = "SELECT * FROM ThongTin";
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Department department = new Department(resultSet.getInt(1), resultSet.getString(2), resultSet.getString( 3));
            departments.add(department);
        }
        conn.close();
        return departments;
    }

    public Department getDepartmentById(int id) throws SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connection Success");

        String sql = "SELECT * FROM ThongTin WHERE TraineeID = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Department department = new Department(resultSet.getInt(1), resultSet.getString(2), resultSet.getString( 3));
            conn.close();
            return department;
        } else {
            conn.close();
            System.out.println("Cannot find department which has id = " + id);
            throw new SQLException("Cannot find department with id");
        }
    }
}
