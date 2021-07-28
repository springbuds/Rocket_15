import java.util.InputMismatchException;

public class Exercise_2_Q3 {
    public static void main(String[] args) {
        int[] number = {1,2,3};
        checkNumb(0);
        System.out.println(number[0]);
    }
    private static void checkNumb(int number){
        if(number>=3){
            throw new ArithmeticException("Nhập 1 số từ 0-3)");
        }
        else{
            System.out.println("Kết quả cần tìm: ");
        }
    }
}
