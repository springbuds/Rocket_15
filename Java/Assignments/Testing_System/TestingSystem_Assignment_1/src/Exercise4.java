import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        //Question 1:
        System.out.println("Question 1:");
        Random random = new Random(); // one for all
        int x = random.nextInt();
        System.out.println(x);
        //Question 2:
        System.out.println("Question 2:");
        double d = random.nextInt();
        System.out.println(d);
        //Question 3:
        System.out.println("Question 3:");
        String[] s= {"Lộc","Lâm","Xuân"};
        int index = random.nextInt(s.length);
        System.out.println(s[index]);
        //Question 4:
        System.out.println("Question 4:");
        int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        System.out.println(randomBirthDate);
        //Question 5:
        System.out.println("Question 5:");
        LocalDateTime date = LocalDateTime.now();
        int maxDayPast = (int) LocalDate.from(date).toEpochDay();
        long randomDayPast =random.nextInt(maxDayPast);
        LocalDate randomBirthDatePast = LocalDate.ofEpochDay(randomDayPast);
        System.out.println(randomBirthDatePast);
        //Question 7:
        System.out.println("Question 7:");
        int Min = 100;
        int Max = 999;
        int randomNum = Min + random.nextInt(Max-Min);
        System.out.println(randomNum);
    }
}
