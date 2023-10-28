import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("abiy", 2342,new int[] {68,67,88});
        Student student2= new Student("elias", 2538,new int[] {77,89,98});
        Teacher teacher1 = new Teacher("Mr.andamlak", "datastructure & algorithm");
        Teacher teacher2 = new Teacher("Mr.ayele", "oodb");
        College college = new College("CCI");


        college.addStudent(student1);
        college.addTeacher(teacher1);
        college.addTeacher(teacher2);
        college.addStudent(student2);

        System.out.println("College Name: " + college.getName());

        System.out.print ("Student1 Name: " + college.getStudents().get(0).getName());
        System.out.print(" ID: " + college.getStudents().get(0).getId());
        System.out.println(" grade: " + Arrays.toString(college.getStudents().get(0).getGrades()));
        System.out.print("Student2 Name: " + college.getStudents().get(1).getName());
        System.out.print("  ID: " + college.getStudents().get(1).getId());
        System.out.println("Student2 grade: " + Arrays.toString(college.getStudents().get(1).getGrades()));

        System.out.println("Teacher Name: " + college.getTeachers().get(0).getName());
        System.out.println("Teacher Name: " + college.getTeachers().get(1).getName());


        System.out.println("subject Name: " + college.getTeachers().get(0).getSubject());

    }
}