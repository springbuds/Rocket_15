package Entity;

public class Student {
    private int id;
    private String name;
    public static String college;
    public static int moneyGroup;
    public static int Count=0;
    public Student() {

    }


    public Student(int id, String name) {
        Count++;
        if(Count>20){
            System.out.println("Nhiều học sinh quá!");
        }
        else {
            this.id = id;
            this.name = name;
            Student.college = "Bách Khoa";
        }

    }
    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + '\'' + ", college='" + college + '\'';
    }
}
