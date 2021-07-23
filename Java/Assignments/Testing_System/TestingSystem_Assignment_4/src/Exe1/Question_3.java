package Exe1;

import java.util.Date;

public class Question_3 {
    int id;
    String GroupName;
    public Account[] accounts;
    Date CreateDate;
    public enum Account {
        abc,aa,bbb;
    }
    Question_3(){
    }
    Question_3(String GroupName,int id){
        this.GroupName= GroupName;
        this.id= id;
    }
}
