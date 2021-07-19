import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise5 {
    public static void Question_1(){
        for(int i = 1 ; i <= 3 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhâp số nguyên thứ " + i + " :");
            int x = sc.nextInt();
        }

    }
    public static void Question_2(){
        for(int i = 1 ; i <= 2 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhâp số thực thứ " + i + " :");
            double x = sc.nextDouble();
        }

    }
    public static void Question_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên :");
        String s = sc.nextLine();

    }
    public static void Question_4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh :");
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateString = sc.nextLine();

    }
    public static void Question_8_10(){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
            n = sc.nextInt();
            if(n>2) System.out.println("Mời bạn nhập lại (1-2)");
            else if(n==1){
                System.out.println("Tạo account");
            }
            else if (n==2){
                System.out.println("Tạo department");
            }

        }
        while (n>2);
        System.out.println("Bạn có muốn thực hiện chức năng khác không?" +
                "\n1.Có" +
                "\n2.Không");
        int m = sc.nextInt();
        if(m==1){
            Question_8_10();
        }
        else if(m==2) return;

    }
    public static void main(String[] args){
        //Question_1();
        //Question_2();
        //Question_3();
        //Question_4();
        Question_8_10();
    }
}
