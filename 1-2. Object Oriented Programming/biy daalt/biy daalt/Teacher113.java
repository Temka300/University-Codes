class Teacher113 {
    private String name;
    private String department;
    private double salary;

    public Teacher113(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void printTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public boolean isSalaryAbove(double value) {
        return salary > value;
    }
}