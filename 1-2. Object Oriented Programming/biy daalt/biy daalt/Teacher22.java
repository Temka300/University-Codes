import java.util.ArrayList;

class Teacher22 {
    private String name;
    private String profession;
    private ArrayList<Student22> students;

    public Teacher22(String name, String profession) {
        this.name = name;
        this.profession = profession;
        this.students = new ArrayList<>();
    }

    public void assignStudent(Student22 student) {
        if (students.size() < 20) {
            students.add(student);
            student.addTeacher(this);
        } else {
            System.out.println("Maximum number of students reached for this teacher.");
        }
    }

    public String toString() {
        return "Teacher: " + name + " (" + profession + ")";
    }

    public void printStudents() {
        System.out.println("Students of " + name + ":");
        for (Student22 student : students) {
            System.out.println(student.toString());
        }
    }
}