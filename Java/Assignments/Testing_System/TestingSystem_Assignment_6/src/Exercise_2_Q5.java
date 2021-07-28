import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_2_Q5 {
    public static void main(String[] args) {
        inputAge();
    }
    private static void inputAge() {
        System.out.print("Nhập tuổi: ");
        Scanner sc = new Scanner(System.in);
         while (sc.hasNextLine()) {
            if (sc.hasNextInt()) {
                if(sc.nextInt()<0){
                    throw new ArithmeticException("Wrong inputing! The age must be greater than 0, please input again.");
                }
                else{
                    System.out.print("Tuổi đã nhập: " + sc.nextInt());
                    return;
                }
            }
            else{
                System.out.println("\t\tWrong inputing! Please input an age as int, input again.");
                System.out.println("Nhập lại: ");
                sc.next();
            }
        }
    }
}
