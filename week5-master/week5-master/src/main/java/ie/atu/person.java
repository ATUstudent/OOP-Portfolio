package ie.atu;

import java.util.Scanner;

public class person {
    String firstName;
    String lastName;
    int age;

    public person(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

    }

    public void displayInfo() {
        System.out.println("name: " + firstName + "" + lastName + ", Age: " + age);
    }

}
