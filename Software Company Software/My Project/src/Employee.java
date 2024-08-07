package javaapplicati;

import java.util.ArrayList;
import java.util.Date;

public class Employee {

    public static int _id = 1;
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<comment> comments = new ArrayList<>();
    public static ArrayList<Task> tasks = new ArrayList<>();
    public static ArrayList<Task> paln = new ArrayList<>();
    public int id;
    private String password;
    private String firstName;
    public Date lastLoginDate;
    public String lastName;
    public String fatherName;
    public String motherName;
    public String username;

    public Employee(String firstName, String lastName, String fatherName, String motherName, String username, String password) {
        this.id = _id++;

        setFirstName(firstName);
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        setUsername(username);
        setPassword(password);
        this.lastLoginDate = lastLoginDate;
    }

    public void setFirstName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("The name must be at least 2 characters long.");
        }
        this.firstName = name;
    }

    public void setUsername(String username) {
        if (username.length() < 4) {
            throw new IllegalArgumentException("The name must be at least 2 characters long.");
        }

        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("The name must be at least 2 characters long.");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

// هذه الدالة للمقارنة اذا كان الموظف موجود من  قبل
    public static boolean Isfound(String username, String password) {
        for (Employee emp : employees) {
            if (emp.getUsername().equals(username) && emp.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void addEmployee(Employee e) {
        employees.add(e);
    }

    public static void PrintEmployees() {
        for (Employee e : employees) {
            System.out.println(e.id + "," + e.firstName + "," + e.lastName + "," + e.fatherName + "," + e.motherName + "," + e.username + "," + e.password);
        }
    }
}
