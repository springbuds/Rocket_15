package Exe4;

import java.util.Scanner;

public class Questtion_1 {
    private int id;
    private String StudentName;
    private String HomeTown;
    private float Scores;
    Questtion_1(){

    }

    Questtion_1(int id, String StudentName,String HomeTown,float Scores){
        this.id = id;
        this.StudentName= StudentName;
        this.HomeTown= HomeTown;
        this.Scores= 0;
    }

    public int getId() {
        return id;
    }

    public String getHomeTown() {
        return HomeTown;
    }

    public String getStudentName() {
        return StudentName;
    }

    public float getScores() {
        return Scores;
    }

    public void setScores(float scores) {
        Scores = scores;
    }

    public void setHomeTown(String homeTown) {
        HomeTown = homeTown;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
