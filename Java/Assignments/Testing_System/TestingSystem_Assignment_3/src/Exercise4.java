import java.util.Scanner;

public class Exercise4 {
    public static void Question_1(){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Nhập chuỗi: ");
        s = sc.nextLine();
        System.out.println("Số kí tự đã nhập: " + s.length());
    }
    public static void Question_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ 1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ 2: ");
        String s2 = sc.nextLine();
        System.out.println("Chuỗi đã nhập: " + s1+" "+s2);
    }
    public static void Question_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String a = sc.nextLine();
        String s = a.toLowerCase();

        char[] arr = s.toCharArray();
        boolean foundspace = true;
        for(int i = 0 ; i< arr.length; i++){
            if(Character.isLetter(arr[i])){
                if(foundspace){
                    arr[i] = Character.toUpperCase(arr[i]);
                    foundspace = false;
                }
            }
            else {
                foundspace = true;
            }
        }
        s = String.valueOf(arr);
        System.out.println("Chuỗi đã nhập: " + s);
    }
    public static void Question_4(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tên: ");
        String s = sc.nextLine();
        String a = s.toUpperCase();
        System.out.println("Xuất chuỗi đã nhập: ");
        String[] b = a.split("");
        for( String item : b )
            System.out.println(item);
    }
    public static void Question_5(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập họ: ");
        String a = sc.nextLine();
        System.out.printf("Nhập tên: ");
        String b = sc.nextLine();
        System.out.println("Họ tên: " + a + " " + b);

    }
    public static void Question_6(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập họ tên: ");
        String a = sc.nextLine();
        System.out.println("Xuất chuỗi đã nhập: ");
        String[] b = a.split(" ");
        for( String item : b )
            System.out.println(item);
    }
    public static void main(String[] args) {
        //Question_1();
        //Question_2();
        //Question_3();
        //Question_4();
        //Question_5();
        Question_6();
    }
}
