import java.util.ArrayList;

class Student22 {
    private String name;
    private int studentCode;
    private ArrayList<Teacher22> teachers;

    public Student22(String name, int studentCode) {
        this.name = name;
        this.studentCode = studentCode;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher22 teacher) {
        teachers.add(teacher);
    }

    public void assignTeacher(Teacher22 teacher) {
        teacher.assignStudent(this);
    }

    public String toString() {
        return "Student: " + name + " (" + studentCode + ")";
    }

    public void printTeachers() {
        System.out.println("Teachers of " + name + ":");
        for (Teacher22 teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }
}