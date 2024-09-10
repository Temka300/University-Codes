class Demo113 {
    public static void main(String[] args) {
        Student113[] students = new Student113[5];
        students[0] = new Student113("Temka", 20, 3.5, "12345");
        students[1] = new Student113("Genghis khan", 22, 3.8, "67890");
        students[2] = new Student113("Zaya", 19, 3.2, "54321");
        students[3] = new Student113("Itgel", 21, 3.9, "09876");
        students[4] = new Student113("Burhan", 18, 3.6, "13579");

        for (Student113 student : students) {
            student.capitalizeNameIfStartsWith('A');
        }

        students[0].changeGPA(4.0);
        students[3].changeGPA(3.7);

        for (Student113 student : students) {
            student.printStudentInfo();
            System.out.println("Number of Characters in Name: " + student.getNumberOfNameCharacters());
            System.out.println("Last Three Code Characters: " + student.getLastThreeCodeCharacters());
            System.out.println();
        }

        Teacher113[] teachers = new Teacher113[3];
        teachers[0] = new Teacher113("John", "Mathematics", 50000);
        teachers[1] = new Teacher113("Mary", "Science", 60000);
        teachers[2] = new Teacher113("Peter", "History", 45000);

        double manualSalaryValue = 55000;

        for (Teacher113 teacher : teachers) {
            if (teacher.isSalaryAbove(manualSalaryValue)) {
                teacher.printTeacherInfo();
                System.out.println();
            }
        }
    }
}