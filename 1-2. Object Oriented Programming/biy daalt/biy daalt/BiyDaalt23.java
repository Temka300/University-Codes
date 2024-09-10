class BiyDaalt23 {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        Student student3 = new Student("Charlie", "S003");
        Student student4 = new Student("David", "S004");
        Student student5 = new Student("Eve", "S005");

        // Create a team
        Team team = new Team("Blue Team");

        // Assign students to the team
        team.assignStudent(student1);
        team.assignStudent(student2);
        team.assignStudent(student3);
        team.assignStudent(student4);
        team.assignStudent(student5);

        // Change the team name
        team.setTeamName("Red Team");

        // Print and view team reports
        team.printTeamInfo();
    }
}