package FrontEnd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Update {
    public static void main(String[] args) throws SQLException, IOException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        // load từ file ra thông tin
        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Kết nối thành công");

        //Viết câu lệnh truy vấn
        String sql = "update `ThongTin` set `fullName` = ? , `Gender`= ? where `TraineeID`= ?";

        // Tạo đối tượng preparedStatement để tạo truy vấn
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // Nhập từ bàn phím (truyền dữ liệu)
        int traineeID = 99;
        String fullName = "Nguyễn Văn B";
        String gender = "Nam";

        //Xử lý gán dữ liệu vào statement
        preparedStatement.setString(1, fullName);
        preparedStatement.setString(2, gender);
        preparedStatement.setInt(3, traineeID);

        //Thực hiện lệnh insert
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động "+ affectedRows);
    }
}
