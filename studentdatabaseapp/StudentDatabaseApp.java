package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // to create one student manually
        // Student student1= new Student();
        // student1.enroll();
        // student1.payTuition();
        // System.out.println(student1.toString());

        // Ask how many new students we want to add

        System.out.println("Enter number of new students to enroll:");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // create a number of many students automatically
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());

        }
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());

        }

    }

}