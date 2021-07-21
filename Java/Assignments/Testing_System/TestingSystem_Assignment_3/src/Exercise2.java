import java.util.Date;

public class Exercise2 {
    public static void Question_1(){
        Date date = new Date();
        for(int i=1;i<6;i++){
            System.out.println("Email: Email " + i );
            System.out.println("Username: User name " + i);
            System.out.println("FullName: Full name " + i);
            System.out.println("CreateDate:" + date);
        }
    }

    public static void main(String[] args) {
        Question_1();
    }
}
