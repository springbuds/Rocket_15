import java.sql.Date;

public class Question {
    int QuestionID;
    String Content;
    CategoryQuestion Category;
    TypeQuestion Type;
    int CreatorID;
    Date CreateDate;
    Exam[] exams;
}
