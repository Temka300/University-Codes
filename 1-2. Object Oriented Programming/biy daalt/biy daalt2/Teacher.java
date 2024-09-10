class Teacher extends Person {
    private String teachingPosition;
    private double salary;

    public Teacher(String name, int age, String teachingPosition, double salary) {
        super(name, age);
        this.teachingPosition = teachingPosition;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Teaching Position: " + teachingPosition);
        System.out.println("Salary: " + salary);
    }
}