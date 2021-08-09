package BackEnd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Exercise3 {
    public void Ques1() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));

        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = DriverManager.getConnection(dbUrl,username,password);
        System.out.println("Connection Success");

        String sql ="{CALL sp_delete_department (?)}";
        CallableStatement callableStatement = conn.prepareCall(sql);

        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập ID cần xóa: ");
        int IN_traineeID = sc.nextInt();

        if(IN_traineeID == IN_traineeID){
            callableStatement.setInt(1, IN_traineeID);
            int affectedRows = callableStatement.executeUpdate();
            if(affectedRows == 0){
                System.out.println("Cannot find department which has id = " + IN_traineeID);
            }
            else {
                System.out.println("Delete id = " + IN_traineeID);
            }
            System.out.println("Số bản ghi bị tác động "+ affectedRows);
        }



    }
}
