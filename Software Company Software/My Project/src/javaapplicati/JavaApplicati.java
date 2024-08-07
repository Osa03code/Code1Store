package javaapplicati;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JavaApplicati {

    public static void main(String[] args) {

        //اضافة موظفين
        Employee emp1 = new Employee("Osama", "AL-Ali", "Mohmaad", "mam", "User_Name", "12345678");
        Employee emp2 = new Employee("Omar", "AL_Jarbooa", "Huseen", "mam", "Omar_User", "545345543");
        Employee emp3 = new Employee("Abdul Rhman", "kibee", "Ahmad", "mam", "Abdo_User", "12345678");
        Employee emp4 = new Employee("Akram", "AL_Hasan", "ALi", "mam", "Akarm_User", "84848448");

        // إنشاء مشاريع
        project pro1 = new project("Database", "SQL, NOSQL");
        project pro2 = new project("Programming", "C# + Angular");
        project pro3 = new project("Hospital", "Design System Hospital");
        // إنشاء خطة

        plan plan1 = new plan("Plan 1", new Date(2023, 1, 1), new Date(2024, 1, 1), 10, "SQL, NOSQL", 1);
        plan plan2 = new plan("Plan 2", new Date(), new Date(), 20, "C# + Angular", 2);
        plan plan3 = new plan("Plan 3", new Date(), new Date(), 30, "Design System Hospital", 3);
        // إنشاء تعليق
        comment comment1 = new comment(emp1, plan1, "The project is ready ", 1, 1, 1);
        comment comment2 = new comment(emp2, plan2, "The project needs modifications", 2, 2, 2);
        comment comment3 = new comment(emp3, plan3, "The project needs more time", 3, 3, 3);
        // إنشاء مهمة
        Task task1 = new Task(1, "Modification of databases", new Date(2023, 1, 1), new Date(2023, 1, 2), "Completed", "Description for Task 1", 5, 1, 1);
        Task task2 = new Task(1, "Work faster", new Date(2024, 12, 12), new Date(2024, 12, 16), "On hold", "Description for Task 2", 5, 1, 1);
        Task task3 = new Task(1, "Starting a new project", new Date(), new Date(), "In Progress", "Description for Task 3", 5, 1, 1);

////
        // إضافة الموظفين إلى القائمة
        Employee.addEmployee(emp1);
        Employee.addEmployee(emp2);
        Employee.addEmployee(emp3);
        Employee.addEmployee(emp4);
        // إضافة المشاريع إلى القائمة
        pro1.addproject(pro1);
        pro2.addproject(pro2);
        pro3.addproject(pro3);
        //اضافة المهام الى القائمة
        Task.AddTask(task1);
        Task.AddTask(task2);
        Task.AddTask(task3);
        // إضافة الخطة إلى المشروع
        plan1.addplans(plan1);
        plan1.addplans(plan2);
        plan1.addplans(plan3);
        //اضافة التليقات الى القائمة
        comment.AddComment(comment1);
        comment.AddComment(comment2);
        comment.AddComment(comment3);

//اضافة تعليقات للخطة
        plan.Commentss.add(comment1);
        plan.Commentss.add(comment2);
        plan.Commentss.add(comment3);
        //اضافة مهام للخطة 
        plan.taskss.add(task1);
        plan.taskss.add(task2);
        plan.taskss.add(task3);
        //اضافة خطط للمشاريع
        project.palans.add(plan1);
        project.palans.add(plan2);
        project.palans.add(plan3);
        //اضافة مهام للوظف
        Employee.paln.add(task1);
        Employee.paln.add(task2);
        Employee.paln.add(task3);
        //اضافة تعليقات للموظف
        Employee.comments.add(comment1);
        Employee.comments.add(comment2);
        Employee.comments.add(comment3);
        //////////////////////////////////
        System.out.println("Employee Isfound: ");
        System.out.println(Employee.Isfound("User_Name", "12345678"));
        System.out.println(Employee.Isfound("Omar_User", "545345543"));

        Employee.PrintEmployees();
        System.out.println("~~~~~~~~");
        project.PrintPrjects();
        System.out.println("~~~~~~~~~");
        plan.PrintPlans();
        System.out.println("~~~~~~~~~");
        comment.PrintComment();
        System.out.println("~~~~~~~~~~");
        Task.PrintTask();
        System.out.println("~~~~~~~~~~~~~~");
        // تحديث ساعات الخطة
        plan1.UpdateTotalHours(1, 11);
        plan2.UpdateTotalHours(2, 5);
        System.out.println("~~~~~~~~~~~~~~");
        // تحديث حالة المهمة إلى مكتملة
        Task.updateTaskCompletion(1, new Date());
        Task.updateTaskCompletion(2, new Date());
        //إرجاع قائمة من المهام المكتملة التي انتهت ضمن نطاق زمني محدد
        System.out.println("~~~~~~~~");
        System.out.println(Task.getCompletedTasksInRange(new Date(2023, 1, 1), new Date(2023, 1, 2)));
        System.out.println("~~~~~~~~~~");
        System.out.println(Task.compareTaskTimeEstimation(new Date(24, 12, 12), new Date(24, 12, 30)));
        System.out.println(Task.compareTaskTimeEstimation(new Date(2000, 1, 1), new Date(2000, 1, 20)));

        System.out.println("---------");
//        compareTaskTimeEstimation(new Date(2023, 1, 1,new Date(2023, 1, 1);
    }

}
