package Exe1;

import java.time.LocalDate;
import java.util.Date;

public class Question_2 {
    int id;
    String email;
    String username;
    String fullname;
    LocalDate createDate;

    Question_2(String email, String abcname, String nguyễn_văn_a, String s){

    }
    Question_2(String email, String username, String fullname){
        this.email= email;
        this.username= username;
        this.fullname= fullname;
        Date creaDate = new Date();
        System.out.println(creaDate);
    }
    Question_2(String email, String username, String fullname, LocalDate createDate){
        Date creaDate = new Date();
    }
}
