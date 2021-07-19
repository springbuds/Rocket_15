import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercise3 {
    public static void main(String[] args) {
        //Question 2:
        System.out.println("Question 2:");
        Date date = new Date();
        System.out.printf("%1$ty-%1$tm-%1$td %tT%n",date,date);
        //Question 3:
        System.out.println("Question 3:");
        System.out.printf("%ty%n",date);
        //Question 4:
        System.out.println("Question 4:");
        System.out.printf("%1$ty-%1$tm",date);
    }
}
