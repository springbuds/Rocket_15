package Entity.Exercise2;

public class Student {
    private final int id;
    private String Name;

    public Student(int id, String name) {
        this.id = id;
        Name = name;
    }

    public final void Study(){
        System.out.println("Is studying....");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
