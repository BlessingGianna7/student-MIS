package studentdatabaseapp;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private String gradeYear;
  private String studentID;
  private String courses;
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;

  // constr. to enter student info
  public Student() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter student first name:");
    this.firstName = scanner.nextLine();

    System.out.println("Enter student last name:");
    this.lastName = scanner.nextLine();

    System.out.println("Enter student's class level:");
    this.gradeYear = scanner.nextLine();
    setStudentID();

  }

  // generate an id
  private void setStudentID() {

    // gradelevel+ id
    id++;
    this.studentID = gradeYear + "" + id;
  }

  // enroll in courses
  public void enroll() {
    do {
      System.out.print("Enter course to enroll in(Q to quit)");
      Scanner scanner = new Scanner(System.in);
      String course = scanner.nextLine();
      if (!course.equals("Q") && !course.equals("q")) {
        courses = courses + "\n " + course;
        tuitionBalance += costOfCourse;

      } else {
        break;
      }
    } while (1 != 0);
    System.out.println("Enrolled in:" + courses);

  }

  // view balance
  public void viewBalance() {
    System.out.println("Your balance is: $" + tuitionBalance);
  }

  // pay tuition
  public void payTuition() {
    viewBalance();
    System.out.print("Enter your payment in $:");
    Scanner scanner = new Scanner(System.in);
    int payment = scanner.nextInt();
    tuitionBalance -= payment;
    System.out.println("Thank your for your payment of $" + payment);
    viewBalance();
  }

  // show status
  public String toString() {
    return "Name:" + firstName + " " + lastName +
        "\nGradeLevel:" + gradeYear +
        "\nStudentID:" + studentID +
        "\nCourses Enrolled in:" + courses +
        "\n Balance: $" + tuitionBalance;
  }

}
