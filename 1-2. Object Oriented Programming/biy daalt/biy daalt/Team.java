import java.util.ArrayList;
import java.util.List;

class Team {
    // Member data
    private String teamName;
    private List<Student> students;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.students = new ArrayList<>();
    }

    // Function to assign team students
    public void assignStudent(Student student) {
        if (students.size() < 5) {
            students.add(student);
        } else {
            System.out.println("Maximum number of students reached for this team.");
        }
    }

    // Organizer function to assign team name
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Function to print team name and information of students belonging to it
    public void printTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student);
        }
    }
}