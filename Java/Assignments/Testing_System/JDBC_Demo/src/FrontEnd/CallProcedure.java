package FrontEnd;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure {
    public static void main(String[] args) throws SQLException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password
        String dbUrl = "jdbc:mysql://localhost:3306/data";
        String username = "root";
        String password = "root";

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Kết nối thành công");

        String sql = "{CALL insert_ThongTin(? ,? ,? )}";
        CallableStatement callableStatement = conn.prepareCall(sql);

        int traineeID = 999;
        String fullName = "Nguyễn Thị C";
        String Gender = "Nữ";

        callableStatement.setInt( 1, traineeID);
        callableStatement.setString(2, fullName);
        callableStatement.setString(3, Gender);

        //Thực hiện call
        int affectedRows = callableStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động "+ affectedRows);
    }
}
