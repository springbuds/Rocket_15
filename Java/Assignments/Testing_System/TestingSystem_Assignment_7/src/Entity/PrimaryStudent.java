package Entity;

public class PrimaryStudent extends Student{
    public static int CountPS=0;
    public PrimaryStudent(){
        CountPS ++;
    }

    public PrimaryStudent(int id, String name) {
        super(id, name);
        CountPS ++;
    }
}
