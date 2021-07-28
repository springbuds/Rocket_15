import java.util.Scanner;

public class Exercies_2_Q4 {
    public static void main(String[] args) {
        getIndex();
    }
    private static void getIndex(){
        String[] departments = {"DEV","MARKETING","TESTER"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số Department cần tìm: ");
        int i = sc.nextInt();
        if(i> 3){
            throw new ArithmeticException("Cannot find department.(Nhập vị trí từ 0-3)");
        }
        else{
            for( int j=0 ; j<3 ; j++){
                System.out.println("Department tại vị trí đã tìm: " + departments[i]);
                return;
            }
        }
    }
}
