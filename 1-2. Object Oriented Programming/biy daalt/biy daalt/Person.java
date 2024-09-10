class Person {
    protected String name;
    protected double salary;
    protected double salaryAfterTax;
    protected double cost;
    protected static double familyIncome;
    protected static double familyExpenses;

    public Person(String name, double salary, double cost) {
        this.name = name;
        this.salary = salary;
        this.cost = cost;
    }

    public void calculateSalaryAfterTax() {
        double socialInsurance = 0.1 * salary;
        double remainingAmount = salary - socialInsurance;
        double insuranceSalary = 0.1 * remainingAmount;
        salaryAfterTax = salary - socialInsurance - insuranceSalary;
    }

    public void addToFamilyExpenses(double expense) {
        familyExpenses += expense;
    }

    public static double getTotalFamilyIncome() {
        return familyIncome;
    }

    public static double getTotalFamilyExpenses() {
        return familyExpenses;
    }

    public void displayIncomeAndExpenses() {
        System.out.println("Name: " + name);
        System.out.println("Income: " + salaryAfterTax);
        System.out.println("Expenses: " + cost);
        System.out.println("Difference: " + (salaryAfterTax - cost));
        System.out.println();
    }

    public static String findMaxCostMember(Person[] members) {
        String maxCostMember = "";
        double maxCost = 0;

        for (Person member : members) {
            if (member.cost > maxCost) {
                maxCost = member.cost;
                maxCostMember = member.name;
            }
        }

        return maxCostMember;
    }
}
