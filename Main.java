
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();

        System.out.print("Enter number of grades: ");
        int numGrades = scanner.nextInt();

        int[] grades = new int[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }

        scanner.nextLine(); // consume the newline character
//
//        System.out.print("Enter student major: ");
//        String  = scanner.nextLine();

        System.out.print("Enter teacher name: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter teacher ID: ");
        int teacherID = scanner.nextInt();

        scanner.nextLine(); // consume the newline character

        System.out.print("Enter teacher subject: ");
        String subject = scanner.nextLine();

        Student student = new Student(studentName, studentID, grades);
        Teacher teacher = new Teacher(teacherName,subject);
        College college = new College(collegeName);

        college.addStudent(student);
        college.addTeacher(teacher);

        System.out.println("College Name: " + college.getName());

        System.out.print ("Student Name: " + college.getStudents().get(0).getName());
        System.out.print(" ID: " + college.getStudents().get(0).getId());
        System.out.println(" grade: " + Arrays.toString(college.getStudents().get(0).getGrades()));
      //  System.out.println("Major: " + college.getStudents().get(0).getMajor());

        System.out.println("Teacher Name: " + college.getTeachers().get(0).getName());
       // System.out.println("ID: " + college.getTeachers().get(0).getId());
  //      System.out.println("Department: " + college.getTeachers().get(0).getDepartment());

    }
}