class BiyDaalt22 {
    public static void main(String[] args) {
        // Create teachers
        Teacher22 teacher1 = new Teacher22("John Smith", "Mathematics");
        Teacher22 teacher2 = new Teacher22("Jane Doe", "Science");

        // Create students
        Student22 student1 = new Student22("Alice Johnson", 12345);
        Student22 student2 = new Student22("Bob Williams", 67890);

        // Assign students to teachers
        teacher1.assignStudent(student1);
        teacher2.assignStudent(student1);
        teacher2.assignStudent(student2);

        // Print information
        System.out.println(teacher1.toString());
        teacher1.printStudents();

        System.out.println();

        System.out.println(teacher2.toString());
        teacher2.printStudents();

        System.out.println();

        System.out.println(student1.toString());
        student1.printTeachers();

        System.out.println();

        System.out.println(student2.toString());
        student2.printTeachers();
    }
}