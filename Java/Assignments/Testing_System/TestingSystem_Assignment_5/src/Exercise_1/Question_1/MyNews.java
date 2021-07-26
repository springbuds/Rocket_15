package Exercise_1.Question_1;

import java.util.Scanner;

public class MyNews {
    public static void Nhap_1(){
        Scanner sc = new Scanner(System.in);
        News news = new News();

        //Insert news
        System.out.println("Nhập ID: ");
        news.setID(sc.nextInt());
        System.out.println("Nhập  Title:");
        news.setTitle(sc.next());
        System.out.println("Nhập PublishDate:");
        news.setPublishDate(sc.next());
        System.out.println("Nhập Author:");
        news.setAuthor(sc.next());
        System.out.println("Nhập Content:");
        news.setContent(sc.next());
        System.out.println("--------------------");
        System.out.println("In thông tin đã nhập:");
        System.out.println("ID: " + news.getID());
        System.out.println("Title: " + news.getTitle());
        System.out.println("PublishDate: " + news.getPublishDate());
        System.out.println("Author: " + news.getAuthor());
        System.out.println("Content: " + news.getContent());
        System.out.println("AverageRate: " + news.getAverageRate());
    }
    public static void Nhap_2(){
        Scanner sc = new Scanner(System.in);
        News news = new News();
        System.out.println("Nhập Title: ");
        news.Title.concat(sc.next());
        System.out.println("Nhập PublishDate: ");
        news.PublishDate.concat(sc.next());
        System.out.println("Nhập Author: ");
        news.Author.concat(sc.next());
        System.out.println("Nhập Content: ");
        news.Content.concat(sc.next());
        System.out.println("--------------------");
        System.out.println("In thông tin đã nhập:");
        System.out.println("Title: " + news.Title);
        System.out.println("PublishDate: " + news.PublishDate);
        System.out.println("Author: " + news.Author);
        System.out.println("Content: " + news.Content);
        System.out.println("AverageRate: " + news.getAverageRate());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số: " +
                "\n\t1:Tạo một object của class News và nhập giá trị" +
                "\n\t2:Thực thi method Display()" +
                "\n\t3:Thực hiện method Calculate() để tính đánh giá trung bình, sau đó thực thi method Display()" +
                "\n\t4:Thoát khỏi chương trình");
        int a   = sc.nextInt();
        if(a==1){
            Nhap_1();
        }
        else if(a==2){
            Nhap_2();
        }
        else if(a==3){

        }
        else if(a==4){
            System.out.println("Kết thúc chương trình");
        }
        else{
            System.out.println("Nhập sai giá trị cho phép");
        }
    }
}
