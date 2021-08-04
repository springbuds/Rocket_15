package BackEnd;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public void Ques1(){
        List<String> Counts = new ArrayList<>();
        Counts.add( "Nguyễn Văn A");
        Counts.add( "Nguyễn Văn B");
        Counts.add( "Nguyễn Văn C");
        Counts.add( "Nguyễn Văn A");
        Counts.add( "Nguyễn Văn A");
        Counts.add( "Nguyễn Văn D");

        //a
        System.out.println("a) Tổng phần tử Student: "+Counts.size());

        //b
        System.out.println("b)Lấy phần tử thứ 4 trong Student: "+ Counts.get(3));

        //c
        System.out.println("c)In ra phần tử đầu và cuối của Student: ");
        System.out.println("Đầu: " + Counts.get(0));
        System.out.println("Cuối: " + Counts.get(Counts.size()-1));

        //d
        System.out.println("d)Chèn E vào đầu: ");
        Counts.add(0 ,"Nguyễn Văn E");
        for (int i = 0 ; i < Counts.size() ; i++){
            System.out.println(Counts.get(i));
        }
        //e
        System.out.println("e)Chèn F vào cuối: ");
        Counts.add( Counts.size() ,"Nguyễn Văn F");
        for (int i = 0 ; i < Counts.size() ; i++){
            System.out.println(Counts.get(i));
        }
    }
}
