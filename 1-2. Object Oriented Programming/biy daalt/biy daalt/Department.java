class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }
}