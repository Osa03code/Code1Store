package javaapplicati;

import java.util.ArrayList;
import java.util.Date;

public class plan {

    public static int _id = 1;

    public  static ArrayList<Task> taskss = new ArrayList<>();
    public static  ArrayList<comment> Commentss = new ArrayList<>();
    public static ArrayList<plan> palans = new ArrayList<>();
    private int id;
    private String planName;
    private Date startDate;
    private Date endDate;
    private int totalHours;
    private String planDescription;
    private int projectId;
    public plan(String planName, Date startDate, Date endDate, int totalHours, String planDescription, int projectId) {

        this.id = _id++;
        this.planName = planName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalHours = totalHours;
        this.planDescription = planDescription;
        this.projectId = projectId;
    }

    public void setPlanName(String planName) throws Exception {
        if (planName.length() <= 2) {
            throw new Exception("Error in PlanName");
        }
        this.planName = planName;
    }

    public static void addplans(plan plan) {
        palans.add(plan);
    }

    //  تحديث إجمالي الساعات في الخطة
    public void UpdateTotalHours(int planId, int additionalHours) {
        for (plan plan : palans) {
            if (plan.id == planId) {
                plan.totalHours += additionalHours;
                System.out.println("Total hours updated for plan " + plan.planName + ": " + plan.totalHours);
                break;
            }
        }
    }

    public static void PrintPlans() {
        for (plan p : palans) {
            System.out.println(p.id + "," + p.planName + "," + p.startDate + "," + p.endDate + "," + p.totalHours + "," + p.projectId);
        }

    }
}
