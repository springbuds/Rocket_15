import java.util.Date;
import java.util.Locale;

public class Exercise2 {

    public static void main(String[] args) {
        //Question 1:
        System.out.println("Question 1:");
        int i=5;
        System.out.println(i);
        //Question 2:
        System.out.println("Question 2:");
        i= 100000000;
        System.out.printf(Locale.US, "%,d %n", i);
        //Question 3:
        System.out.println("Question 3:");
        double f = 5.567098;
        System.out.printf("%.4s %n",f);
        //Question 4:
        System.out.println("Question 4:");
        String s = "Nguyễn Văn A";
        System.out.println("Tôi tên là " + s + " và tôi vẫn độc thân!");
        //Question 5:
        System.out.println("Question 5:");
        Date date = new Date();
        System.out.println(date);
        //Question 5:
        System.out.println("/nQuestion 5:");

    }
}
