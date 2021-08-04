package BackEnd;

import Entity.Student;

import java.util.*;

public class Exercise3 {

    public void Ques2() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(123,"ABC");
        print(student);
        System.out.println("Nhập thông tin cần in: ");
        print("Thông tin vừa nhập: " + sc.next());
    }
    public static <T> void print (T a){
        System.out.println(a.toString());
    }

    public void Ques4(){
        List<Float> a = new ArrayList<>();
        a.add(1f);
        a.add(2f);
        a.add(3f);
        a.add(4f);
        printf(a);
    }
    public static <E> void printf(List<E> a){
        a.forEach(x -> System.out.println(x.toString()));
    }

    public void Ques6(){
        Map<Integer, String> student = new HashMap<>();
        student.put( 1 , "A");
        student.put( 2 , "B");
        student.put( 3 , "C");
        System.out.println(student.get(1));
    }
}
