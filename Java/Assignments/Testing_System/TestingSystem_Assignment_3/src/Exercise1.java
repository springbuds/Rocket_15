import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void Question_1(){
        float x = 5240.5F;
        float y = 10970.055F;
        int a = (int) x;
        int b = (int) y;

        System.out.println(a);
        System.out.println(b);
    }
    public static void Question_2(){
        Random random = new Random();
        int x = random.nextInt(100000);
        String s = String.valueOf(x);
        int numb = 5 - s.length();
        String a ="";
        for(int i =0;i<numb;i++){
            a += '0';
        }
        System.out.println(a+s);
        System.out.println((a+s).substring(3));
    }
    public static void Question_4(){
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextInt();
        System.out.println("Nhập b:");
        b = sc.nextInt();
        System.out.println("a/b: " + a/b);
    }
    public static void main(String[] args) {
        //Question_1();
        Question_2();
        //Question_4();
    }
}
