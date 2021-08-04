package BackEnd;

import Entity.Student;
import java.util.HashSet;
import java.util.Set;

public class Exercise2{

    public void Ques1(){
        Student student1 = new Student(12, "F");
        Student student2 = new Student(21, "B");
        Student student3 = new Student(3, "C");
        Student student4 = new Student(10, "A");
        Set<Student> setStudent = new HashSet<>();
        setStudent.add(student1);
        setStudent.add(student2);
        setStudent.add(student3);
        setStudent.add(student4);

        for (Student student : setStudent){
            System.out.println(student);
        }

    }
}
