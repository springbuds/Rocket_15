package Exercise_1.Question_1;

import java.util.Date;

public class News implements INews {
    int ID ;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return Calculate();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        String Title;
        String PublishDate;
        String Author;
        String Content;
        float AverageRate;
    }

    @Override
    public float Calculate() {
        int a = 1;
        int b = 2;
        int c = 3;
        return (float)((a+b+c)/3);
    }
}
