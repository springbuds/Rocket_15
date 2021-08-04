package Entity;

public class Student {
    int id;
    String Name;

    public Student(int id, String name) {
        this.id = id;
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
