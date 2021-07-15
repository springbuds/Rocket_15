import java.sql.Date;

public class Exam {
    int ExamID;
    String Code;
    String Title;
    CategoryQuestion Category;
    Date Duration;
    int CreatorID;
    Date CreateDate;
    Question[] questions;
}
