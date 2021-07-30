package Entity;

public class SecondaryStudent extends Student{
    public static int CountSS=0;
    public SecondaryStudent(){
        CountSS ++;
    }

    public SecondaryStudent(int id, String name) {
        super(id, name);
        CountSS ++;
    }
}
