import java.util.ArrayList;

class University {
    private String schoolName;
    private ArrayList<Department> departments;

    public University(String schoolName) {
        this.schoolName = schoolName;
        this.departments = new ArrayList<>();
    }

    public void createDepartment(String departmentName) {
        if (departments.size() < 4) {
            Department department = new Department(departmentName);
            departments.add(department);
        } else {
            System.out.println("Maximum number of departments reached for this university.");
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void printUniversityInfo() {
        System.out.println("University: " + schoolName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.printDepartmentInfo();
        }
    }
}