package FrontEnd;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password
        String dbUrl = "jdbc:mysql://localhost:3306/data";
        String username = "root";
        String password = "root";

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Kết nối thành công");

        //--1--Khởi tạo đối tượng Statement
        //--1--//Statement stmt = conn.createStatement();

        //Viết câu lệnh truy vấn
        //--1--///String sql = "insert into `data`.`ThongTin`(`TraineeID`,`fullName`,`Gender`) values (100,'Ly Ly','Nữ')";
        String sql = "insert into `data`.`ThongTin`(`TraineeID`,`fullName`,`Gender`) values ( ?, ?, ?)";

        //--2-- Tạo đối tượng preparedStatement để tạo truy vấn
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        //--2-- Nhập từ bàn phím (truyền dữ liệu)
        int traineeID = 99;
        String fullName = "Nguyễn Văn A";
        String gender = "Nam";

        //--2-- Xử lý gán dữ liệu vào statement
        preparedStatement.setInt(1, traineeID);
        preparedStatement.setString(2, fullName);
        preparedStatement.setString(3, gender);

        //Thực hiện lệnh insert
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động "+ affectedRows);

    }
}
