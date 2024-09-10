class BiyDaalt24 {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Harvard University");

        // Create departments
        university.createDepartment("Department of Mathematics");
        university.createDepartment("Department of Computer Science");

        // Print university information
        university.printUniversityInfo();
    }
}