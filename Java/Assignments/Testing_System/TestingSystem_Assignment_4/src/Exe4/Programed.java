package Exe4;

import java.util.Scanner;

public class Programed {
    private static void setScores(){
        Scanner sc = new Scanner(System.in);
        Questtion_1 questtion_1 = new Questtion_1();
        System.out.println("Nhập điểm: ");
        questtion_1.setScores(sc.nextFloat());
    }
    private static void Sum (){
        Scanner sc = new Scanner(System.in);
        Questtion_1 questtion_1 = new Questtion_1();
        System.out.println("Nhập điểm để cộng: ");
        float a = sc.nextFloat() + sc.nextFloat();
        System.out.println("Tổng điểm: " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //setScores();
        Sum();

    }
}
