class Teacher242 extends Person242 {
    private String teachingPosition;
    private double salary;
    
    Teacher242(String name, int age) {
        this(name, age, "Head teacher");
    }
    
    Teacher242(String name, int age, String position) {
        this.name = name;
        this.age = age;
        teachingPosition = position;
    }
    
    void display() {
        super.display();
        System.out.println("Teaching Position: " + teachingPosition);
        System.out.println("Salary: " + salary);
    }
    
    void determineSalary() {
        if (teachingPosition.equals("Assistant Teacher")) {
            salary = 3000.0;
        } else if (teachingPosition.equals("Teacher")) {
            salary = 5000.0;
        } else if (teachingPosition.equals("Senior Teacher")) {
            salary = 8000.0;
        }
    }
}