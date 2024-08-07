package javaapplicati;
import java.util.ArrayList;

 
public class project { 
     public static int _id=1; 
        public static ArrayList<project> projects = new ArrayList<>();
        public static ArrayList<plan> palans = new ArrayList<>();
        public int id;
        public String projectName;
        public String projectDescription;

        public  project(  String projectName, String projectDescription) {
            this.id = _id++;
            this.projectName = projectName;
            this.projectDescription = projectDescription;
        }

        public static  void addproject(project p) {
            projects.add(p);
        }
        public static void PrintPrjects(){
            for (project p  : projects) {
                System.out.println(p.id+","+p.projectName+","+p.projectDescription);
            }
        }
    }

 