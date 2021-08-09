package FrontEnd;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Program1 {
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

        //Khởi tạo đối tượng Statement
        Statement stmt = conn.createStatement();

        //Viết câu lệnh truy vấn
        String sql = "select fullName, Gender from ThongTin";

        //Tạo đối tượng ResultSet để hứng kết quả trả về khi truy vấn
        ResultSet rs = stmt.executeQuery(sql);

        //In kết quả trả về
        while (rs.next()){
            System.out.print(rs.getString("fullName"));
            System.out.print("  |   ");
            System.out.print(rs.getString("Gender"));
            System.out.println();
        }
    }
}
