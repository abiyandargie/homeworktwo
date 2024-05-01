import java.util.ArrayList;

/**
 * The College class represents a college.
 * It has attributes such as name and list of students and teachers.
 */
public class College {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    public College(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }

    public College(String cci, ArrayList<Student> students, ArrayList<Teacher> teachers) {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}