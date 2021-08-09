package BackEnd;

import com.mysql.cj.jdbc.JdbcConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Exercise1 {
    public void Ques1() throws SQLException, IOException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        // load từ file ra thông tin
        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connect success!");
    }

    public void Ques2() throws SQLException, IOException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        // load từ file ra thông tin
        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connect success!");
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

    public void Ques3() throws SQLException {
        //Khởi tạo các biến lưu thông tin DB gồm host, username, password
        String dbUrl = "jdbc:mysql://localhost:3306/data";
        String username = "root";
        String password = "root";

        //Khởi tạo Connection tới DB  thông qua host, username, password
        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Kết nối thành công");
        //Viết câu lệnh truy vấn
        String sql = "insert into `data`.`ThongTin`(`TraineeID`,`fullName`,`Gender`) values ( ?, ?, ?)";

        //Tạo đối tượng preparedStatement để tạo truy vấn
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        //Nhập từ bàn phím (truyền dữ liệu)
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int traineeID = sc.nextInt();
        System.out.println("Nhập tên: ");
        String fullName = sc.next();
        System.out.println("Nhập giới tính: ");
        String gender = sc.next();

        //Xử lý gán dữ liệu vào statement
        preparedStatement.setInt(1, traineeID);
        preparedStatement.setString(2, fullName);
        preparedStatement.setString(3, gender);

        //Thực hiện lệnh insert
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động "+ affectedRows);
    }

    public void Ques4() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connection Success");

        String sql = " UPDATE `ThongTin` SET `Position` = 'DEV' WHERE `TraineeID` = 5";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        int affectedRows =preparedStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động "+affectedRows);
    }

    public void Ques5() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connection Success");

        String sql = "DELETE FROM `ThongTin` WHERE `TraineeID` = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int traineeID = sc.nextInt();
        preparedStatement.setInt(1, traineeID);

        int affectedRows = preparedStatement.executeUpdate();
        System.out.println("Số bản ghi bị tác động: " +affectedRows);
    }
}
