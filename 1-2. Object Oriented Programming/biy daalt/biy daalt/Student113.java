class Student113 {
    private String name;
    private int age;
    private double gpa;
    private String code;

    public Student113(String name, int age, double gpa, String code) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.code = code;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Code: " + code);
    }

    public void changeGPA(double newGpa) {
        gpa = newGpa;
    }

    public void capitalizeNameIfStartsWith(char letter) {
        if (name.charAt(0) == letter) {
            name = name.toUpperCase();
        }
    }

    public int getNumberOfNameCharacters() {
        return name.length();
    }

    public String getLastThreeCodeCharacters() {
        if (code.length() >= 3) {
            return code.substring(code.length() - 3);
        } else {
            return code;
        }
    }

    public boolean isNameSameAs(String givenName) {
        return name.equalsIgnoreCase(givenName);
    }
}
