package BackEnd;

import Entity.PrimaryStudent;
import Entity.SecondaryStudent;
import Entity.Student;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public void Ques1() {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        Student student4 = new Student(4, "Nguyễn Văn D");
        Student[] students = new Student[]{student1, student2, student3, student4};
        Arrays.stream(students).forEach(System.out::println);
        System.out.println("Thay doi static sang Công nghiệp");
        Student.college = "Công Nghiệp";
        Arrays.stream(students).forEach(System.out::println);
    }

    public void Ques2(){
        Student.moneyGroup += 300;
        System.out.println("Student 1 lấy 50k đi mua bim bim tiền nhóm còn: ");
        System.out.println(Student.moneyGroup -= 50);
        System.out.println("Student 2 lấy 20k đi ma bánh mì tiền nhóm còn: ");
        System.out.println(Student.moneyGroup -=20);
        System.out.println("Student 3 lấy 150k mua đồ dùng học tập cho nhóm tiền nhóm còn: ");
        System.out.println(Student.moneyGroup -=150);
        System.out.println("Cả nhóm mỗi người đóng thêm 50K tiền nhóm là: ");
        System.out.println(Student.moneyGroup += 150);
    }

    public void Ques4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập College mới:");
        Student.setCollege(sc.nextLine());
        System.out.println(Student.getCollege());
    }

    public void Ques5(){
        System.out.println("Số học sinh được sinh ra: " + Student.Count);
    }

    public void Ques6(){
        System.out.println("Tạo 2 Primary Student: ");
        PrimaryStudent PS1 = new PrimaryStudent();
        PrimaryStudent PS2 = new PrimaryStudent();
        System.out.println("Tạo 6 Secondary Student: ");
        SecondaryStudent SS1 = new SecondaryStudent();
        SecondaryStudent SS2 = new SecondaryStudent();
        SecondaryStudent SS3 = new SecondaryStudent();
        SecondaryStudent SS4 = new SecondaryStudent();
        SecondaryStudent SS5 = new SecondaryStudent();
        SecondaryStudent SS6 = new SecondaryStudent();
        System.out.println("Student: " + Student.Count);
        System.out.println("PrimaryStudent: " + PrimaryStudent.Count);
        System.out.println("SecondaryStudent: " + SecondaryStudent.Count);
    }
}
