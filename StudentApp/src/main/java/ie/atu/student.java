package ie.atu;

public class student{
    public static void main(String[] args) {

      StudentApp student1 = new StudentApp("","","");
      StudentApp student2 = new StudentApp("","","");
      StudentApp student3 = new StudentApp("","","");

      System.out.println("Enter your name");
        student1.getInfo();

        System.out.println("Enter another name");
        student2.getInfo();

        System.out.println("Enter another name");
        student3.getInfo();
    }
}