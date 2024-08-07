package javaapplicati;
import java.util.ArrayList;

 
public class comment {
    

 public static int _id=1;

    public Employee Employee;
    public static ArrayList<comment> comments = new ArrayList<>();

    public plan paln;
    public int id;
    public String commentText;
    public int employeeId;
    public int planId;
    public int CommentId;

    public comment(Employee Employee, plan paln,  String commentText, int employeeId, int planId,int CommentId) {
        this.Employee = Employee;
        this.paln = paln;
        this.id = _id++;
        this.commentText = commentText;
        this.employeeId = employeeId;
       this.planId = planId;
    this.CommentId=CommentId;
    }
public static void AddComment(comment com){
    comments.add(com);
}
    
    public static void PrintComment(){
        for (comment c  : comments) {
            System.out.println(c.id+","+c.commentText+","+c.CommentId+","+c.employeeId+","+c.planId);
        }
    }
}