package ie.atu;

import java.util.Scanner;

public class StudentApp {
private String studentName;
private String studentEmail;
private String courseName;

    public StudentApp() {
        this.setstudentName(studentName);
        this.setstudentEmail(studentEmail);
        this.setcourseName(courseName);
    }

    public StudentApp(String studentName, String studentEmail, String courseName)
    {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.courseName = courseName;
    }
    public void getInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        this.studentName = scanner.nextLine();

        System.out.println("Enter your Student Email ");
        this.studentEmail = scanner.nextLine();

        System.out.println("Enter your course Name ");
        this.courseName = scanner.nextLine();
    }
    public String getStudentName()
    {
        return studentName;
    }

    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public String getStudentEmail()
    {
        return studentEmail;
    }

    public void setstudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }
    public String getCourseName()
    {
        return courseName;
    }

    public void setcourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public void displayInfo()
    {
        System.out.println(" Student name is " + studentName + "\n Your email is " + studentEmail + "\n Your course is " + courseName);
    }


}
