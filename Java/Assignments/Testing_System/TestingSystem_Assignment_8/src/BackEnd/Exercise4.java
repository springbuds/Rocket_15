package BackEnd;

import Entity.MyMath;
import Entity.Salary;

import java.util.Scanner;

public class Exercise4 {
    public void Ques1(){
        Salary<Integer> salary = new Salary<>(15);
        salary.printf();
    }

    public void Ques2(){

    }

    public void Ques3(){
        MyMath myMath = new MyMath();
        System.out.println("Sum : " + myMath.sum(1 , 2.2));
    }
}
