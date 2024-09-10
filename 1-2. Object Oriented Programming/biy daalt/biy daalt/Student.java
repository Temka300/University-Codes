class Student {
    // Member data
    private String name;
    private String code;

    // Constructor
    public Student(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Organizer function to assign student name and code
    public void setStudentInfo(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Function to print student name and code
    @Override
    public String toString() {
        return "Student: " + name + ", Code: " + code;
    }
}