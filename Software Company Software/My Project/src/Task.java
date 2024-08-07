package javaapplicati;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 
public class Task {
 public static int _id=1;

    private int id;
    private String taskName;
    private Date startDate;
    private Date endDate;
    private String status;
    private String taskDescription;
    private int hours;
    private int employeeId;
    private int planId;

    private static List<Task> tasks = new ArrayList<>();
    private static int lastTaskId = 10000;

    public Task(int id, String taskName, Date startDate, Date endDate, String status, String taskDescription, int hours, int employeeId, int planId) {
        this.id = _id++;
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.taskDescription = taskDescription;
        this.hours = hours;
        this.employeeId = employeeId;
        this.planId = planId;
    }

    // Getters and setters
   

    public String getTaskName() {
        return taskName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getHours() {
        return hours;
    }

   public static void AddTask(Task task){
       tasks.add(task);
   }
 
 // Static method to update task completion status and end date

  public static void updateTaskCompletion(int taskId, Date completionDate) {
        for (Task task : tasks) {
            if (task.id== taskId) {
                task.status = "Completed";
                task.endDate = completionDate;
                System.out.println("Task " + task.getTaskName() + " completed on " + task.getEndDate());
                break;
            }
        }
    }

    // Static method to get completed tasks within a date range
    public static List<Task> getCompletedTasksInRange(Date startDate, Date endDate) {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus()
                            .equals("Completed")&& task
                            .getEndDate()
                            .after(startDate) && task
                            .getEndDate()
                            .before(endDate)) {
                long diffInMilliseconds = Math.abs(task.getStartDate().getTime() - task.getEndDate().getTime());
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                if (diffInDays <= 7) {
                    completedTasks.add(task);
                }
            }
        }
        return completedTasks;
    }

    // 1 اخذت وقت اكثر من المتوقع
    // -1 اخذت وقت اقل من المتوقع
    //0 اخذت الوقت المتوقع لها
    public static int compareTaskTimeEstimation(Date startDate, Date endDate) {
        int totalTimeEstimation = 0;
        int totalTimeActual = 0;
        for (Task task : tasks) {
            if (task.getStartDate().after(startDate) && task.getEndDate().before(endDate)) {
                totalTimeEstimation += task.getHours();
                long diffInMilliseconds = Math.abs(task.getStartDate().getTime() - task.getEndDate().getTime());
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                totalTimeActual += diffInDays;
            }
        }
        if (totalTimeActual > totalTimeEstimation) {
            return -1; // Tasks took more time than expected
        } else if (totalTimeActual == totalTimeEstimation) {
            return 0; // Tasks took expected time
        } else {
            return 1; // Tasks completed early
        }
    }
    
    public static void PrintTask(){
    for (Task t : tasks) {
        System.out.println(t.id+","+t.taskName+","+t.startDate+","+t.endDate+","+t.status+","+t.taskDescription+","+t.hours+","+t.employeeId+","+t.planId    );
    }
}
} 

